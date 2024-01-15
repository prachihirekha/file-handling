package com.bootcoding.serivce;

import com.bootcoding.helper.HouseBuilder;
import com.bootcoding.inmemory.InMemoryStorage;
import com.bootcoding.model.House;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader  implements ReadOperation{

    public  void read(String path) {
        File file = new File(path);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){

            String line = reader.readLine();
            while ((line = reader.readLine()) != null) ;


            House houses = HouseBuilder.buildHouse(line);

          InMemoryStorage.houses.add(houses);


        } catch (IOException ex) {
            System.out.println("File not found!");
        }
    }
}
