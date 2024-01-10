package com.bootcoding.file.read;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {
        File f = new File("src/main/resources/housing_price_dataset.csv");
        try{
            Scanner read = new Scanner(f);
            while (read.hasNext()){
                System.out.println(read.nextLine());
            }
        }catch (IOException i){
            i.printStackTrace();
        }
    }
}
