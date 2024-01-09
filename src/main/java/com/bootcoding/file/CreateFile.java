package com.bootcoding.file;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        // object created
        File file = new File("src/main/resources/document.txt");
       try{
           if(file.exists()){
               System.out.println("already exist");
           }
           else {
               file.createNewFile();
           }
       }catch (IOException ioException){
          ioException.printStackTrace();
       }
    }
}
