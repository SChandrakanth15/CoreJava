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
                System.out.println(name);
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
