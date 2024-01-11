package com.bootcoding.file.write;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteByBufferWriter {
    public static void main(String[] args) {
       try{
           String text ="\n Using the buffer writer to write the text in the document";
           BufferedWriter wr = new BufferedWriter(new FileWriter(new File("src/main/resources/document.txt"),true));
           wr.write(text);
           wr.flush();
           System.out.println("write inside the file........");
           wr.close();
       }catch (IOException i){
           i.printStackTrace();
       }
    }
}
