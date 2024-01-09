package com.bootcoding.file;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("src/main/resources/document.txt");
        try{
            if(!file.exists()){
                file.createNewFile();
                System.out.println("Create a new file");
            }
            else{
                file.delete();
                System.out.println("file has been deleted");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
