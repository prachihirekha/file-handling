package com.bootcoding.file.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    public static void main(String[] args) {
        File file= new File("src/main/resources/housing_price_dataset.csv");
        try{
            // created a object by using
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while((line= reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
