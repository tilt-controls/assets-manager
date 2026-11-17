package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("my house", "2024-08-20", new BigDecimal("250000.00"), "123 Street", 2, 1800, 6000));
        assets.add(new House("your house", "2026-09-25", new BigDecimal("150000.00"), "456 Avenue", 1, 3000, 8000));
        assets.add(new Vehicle("Used Car", "2014-06-15", new BigDecimal("30000.00"), "Honda Civc", 2014, 130000));
        assets.add(new Vehicle("Tom's truck", "2024-01-01", new BigDecimal("20000.00"), "Ford F-150", 2022, 12000));

        for (Asset asset : assets) {
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.printf("""
                        Year: %d
                        Make & Model: %s\n""", vehicle.getYear(), vehicle.getMakeModel());
            }
            System.out.printf("""
                    Description: %s
                    Date: %s
                    Original Cost: %.2f
                    Value: %.2f
                    \n""", asset.getDescription(), asset.getDateAcquired(), asset.getOriginalCost(), asset.getValue());
        }
    }
}
