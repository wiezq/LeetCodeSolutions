package org.example.nio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Chunker {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("inputMusic.txt"));
        List<String> a = new ArrayList<>();
        int chunkCount = 0;
        String line;
        while ((line = bf.readLine()) != null ){
            if (a.size() == 500){
                String outputname = "chunk" + chunkCount;
                BufferedWriter b = new BufferedWriter(new FileWriter(outputname));
                for (String s : a) {
                    b.write(s + "\n");
                }
                chunkCount++;
                a.clear();
            }
            a.add(line);
        }
        if(a.size() > 0){
            String outputname = "chunk" + chunkCount;
            BufferedWriter b = new BufferedWriter(new FileWriter(outputname));
            for (String s : a) {
                b.write(s + "\n");
            }
        }
    }
}
