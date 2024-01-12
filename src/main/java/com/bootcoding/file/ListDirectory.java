package com.bootcoding.file;

import java.io.File;


public class ListDirectory {
    public static void main(String[] args) {
   new ListDirectory().lisAllDirectory("src");
    }
     private  void lisAllDirectory(String path){
        File file=new File(path);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f : files){
                if(!f.getName().startsWith(".")) {
                    if (f.isDirectory()) {
                        lisAllDirectory(f.getPath());
                    }else {
                        print(f);
                    }
                }
                }
            }else{
            print(file);

        }

     }
     private void print(File file){
         System.out.println(file.getPath());
     }
}
