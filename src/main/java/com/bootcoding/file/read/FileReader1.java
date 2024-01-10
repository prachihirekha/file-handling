package com.bootcoding.file.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// using file reader to read the file
public class FileReader1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/housing_price_dataset.csv");
        try{
            FileReader readChar =new FileReader(file);
            int i;
            while((i=readChar.read())!= -1){
                System.out.print((char) i);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
