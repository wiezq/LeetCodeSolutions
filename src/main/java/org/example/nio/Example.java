package org.example.nio;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Example {
    public static void main(String[] args) throws IOException {
        // Set the input and output file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "reversed.txt";

        // Set the chunk size (in bytes)
        int chunkSize = 200 * 1024 * 1024; // 256 MB

        // Split the input file into sorted chunks
        List<File> chunkFiles = splitFile(inputFilePath, chunkSize);

        // Merge the sorted chunks into the output file
        mergeFiles(chunkFiles, outputFilePath);

        // Clean up the temporary chunk files
        for (File chunkFile : chunkFiles) {
            chunkFile.delete();
        }
    }

    private static List<File> splitFile(String inputFilePath, int chunkSize) throws IOException, IOException {
        List<File> chunkFiles = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
        String line;

        // Read and sort chunks of the input file
        while ((line = reader.readLine()) != null) {
            List<String> chunkLines = new ArrayList<>();
            int chunkBytes = 0;

            // Read lines into the chunk until it reaches the chunk size limit
            while (line != null && chunkBytes + line.getBytes(StandardCharsets.UTF_8).length <= chunkSize) {
                chunkLines.add(line);
                chunkBytes += line.getBytes(StandardCharsets.UTF_8).length;
                line = reader.readLine();
            }

            // Sort the chunk lines in reverse order
            Collections.reverse(chunkLines);

            // Write the sorted chunk lines to a temporary file
            File chunkFile = File.createTempFile("chunk", ".tmp");
            chunkFile.deleteOnExit();
            BufferedWriter writer = new BufferedWriter(new FileWriter(chunkFile));
            for (String chunkLine : chunkLines) {
                writer.write(chunkLine);
                writer.newLine();
            }
            writer.close();

            // Add the temporary chunk file to the list
            chunkFiles.add(chunkFile);
        }

        reader.close();

        return chunkFiles;
    }

    private static void mergeFiles(List<File> files, String outputFilePath) throws IOException {
        // Open a reader for each input file
        List<BufferedReader> readers = new ArrayList<>();
        for (File file : files) {
            readers.add(new BufferedReader(new FileReader(file)));
        }

        // Create a priority queue to merge the lines from all input files
        PriorityQueue<LineWithReader> queue = new PriorityQueue<>(files.size(), (l1, l2) -> l2.line.compareTo(l1.line));
        for (BufferedReader reader : readers) {
            String line = reader.readLine();
            if (line != null) {
                queue.offer(new LineWithReader(line, reader));
            }
        }

        // Write the lines to the output file in reverse order
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
        while (!queue.isEmpty()) {
            LineWithReader lineWithReader = queue.poll();
            writer.write(lineWithReader.line);
            writer.newLine();

            String line = lineWithReader.reader.readLine();
            if (line != null) {
                queue.offer(new LineWithReader(line, lineWithReader.reader));
            }
        }

        // Close the readers and writer
        for (BufferedReader reader : readers) {
            reader.close();
        }
        writer.close();
    }

    private static class LineWithReader {
        public final String line;
        public final BufferedReader reader;

        public LineWithReader(String line, BufferedReader reader) {
            this.line = line;
            this.reader = reader;
        }
    }


}
