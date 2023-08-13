package org.example.nio;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseHugeFile {


    public static void main(String[] args) throws IOException {
        int MAX_HEAP = 512 * 1024 * 1024;
        int chunkCount = 0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));
        List<String> tempStrings = new ArrayList<>();
        int chunkBytes = 0;
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            if (chunkBytes + s.getBytes(StandardCharsets.UTF_8).length > MAX_HEAP) {
                Collections.reverse(tempStrings);
                BufferedWriter chunkWriter = new BufferedWriter(new FileWriter(String.format("chunk%d", chunkCount)));
                for (String tempString : tempStrings) {
                    chunkWriter.write(tempString);
                    chunkWriter.newLine();
                }
                chunkWriter.close();
                tempStrings.clear();
                chunkCount += 1;
                chunkBytes = 0;
            }
            chunkBytes += s.getBytes(StandardCharsets.UTF_8).length;
            tempStrings.add(s);

        }
        bufferedReader.close();
//        bufferedWriter.close();
    }


    public void reverseBigFile(String input) {

    }

    public void createBigFile() {
        BufferedWriter bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("input.txt"));
            int max = (int) Math.pow(2, 27);
            for (int i = 0; i < max; i++) {
                bufferedWriter.write(String.format("Line number: %d \n", i));
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
