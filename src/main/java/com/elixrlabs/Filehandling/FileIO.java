package com.elixrlabs.Filehandling;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        String names[] = {"Akon", "Bkon", "Ckon", "Dkon", "Ekon"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("myfile.txt"));
            writer.write("hi how are you!");
            writer.write("\n" + "this is the second line dear!");
            for (String name : names) {
                writer.write("\n" + name);
                //System.out.println(name);
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

//https://www.youtube.com/watch?v=FWoYpM-E3EQ