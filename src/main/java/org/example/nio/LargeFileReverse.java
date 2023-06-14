package org.example.nio;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

public class LargeFileReverse {

    private static final int CHUNK_SIZE = 1024 * 1024; // 1 MB

    public static void main(String[] args) throws IOException {

        String inputFile = "input.txt";
        String outputFile = "output.txt";

        reverseLargeFile(inputFile, outputFile);
    }

    private static void reverseLargeFile(String inputFile, String outputFile) throws IOException {
        try (RandomAccessFile input = new RandomAccessFile(inputFile, "r");
             RandomAccessFile output = new RandomAccessFile(outputFile, "rw")) {

            long inputLength = input.length();
            long outputPosition = 0;

            // Process the file in chunks, starting from the end
            for (long inputPosition = inputLength - 1; inputPosition >= 0; inputPosition -= CHUNK_SIZE) {
                // Calculate the actual chunk size
                int actualChunkSize = (int) Math.min(CHUNK_SIZE, inputPosition + 1);

                // Read the chunk from the input file
                byte[] chunk = new byte[actualChunkSize];
                input.seek(inputPosition - actualChunkSize + 1);
                input.readFully(chunk);

                // Reverse the chunk
                for (int i = 0; i < actualChunkSize / 2; i++) {
                    byte temp = chunk[i];
                    chunk[i] = chunk[actualChunkSize - i - 1];
                    chunk[actualChunkSize - i - 1] = temp;
                }

                // Write the reversed chunk to the output file
                output.seek(outputPosition);
                output.write(chunk);
                outputPosition += actualChunkSize;
            }
        }
    }
}
