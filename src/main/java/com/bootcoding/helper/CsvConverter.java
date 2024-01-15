package com.bootcoding.helper;

import com.bootcoding.model.House;

public class CsvConverter {
public static String toCsv(House house){
    return house.getSquareFeet()
            +","+ house.getBathroom()
            +","+ house.getBedroom()
            +","+ house.getPrice()
            +","+ house.getYearBuilt()
            +","+ house.getNeighborhood();
}
}
