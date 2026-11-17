package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        House house1 = new House("my house", "2024-08-20", new BigDecimal("250000.00"), "123 Street", 2, 1800, 6000);

        System.out.println(house1.getValue());

        Vehicle vehicle1 = new Vehicle("Used Ford Truck", "2014-06-15", new BigDecimal("20000.00"), "Ford F-150", 2014, 120000);
        System.out.println(vehicle1.getValue());
    }
}
