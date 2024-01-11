package com.bootcoding.file.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class WriteByFileOutStream {
    public static void main(String[] args) {
        try{
            String text ="Write  in the file using file output stream";
            FileOutputStream fos = new FileOutputStream(new File("src/main/resources/document.txt"), true);
            fos.write(text.getBytes());
            System.out.println( "message will be write");
           fos.close();
        }catch (IOException es){
            es.printStackTrace();
        }
    }
}
