package com.bootcoding.file.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class UsingPrintStream {
    public static void main(String[] args) {
         try{
             String txt ="\n this is using by print stream ......";
             PrintStream ps = new PrintStream(new FileOutputStream(new File("src/main/resources/document.txt"), true));
             ps.println(txt);
             System.out.println("out to see");
             ps.close();
         }catch (IOException io){
             io.printStackTrace();
         }
    }
}
