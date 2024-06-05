package com.elixrlabs.Filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class CreateAFile {
    public static void main(String[] args) {
        //to create a file.
        try {
            File myfile = new File("demo.txt");
            myfile.createNewFile();
            System.out.println("file have been created!" + myfile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
