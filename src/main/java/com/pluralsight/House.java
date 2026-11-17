package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public BigDecimal getValue() {
        if (getCondition() == 1) {
            return new BigDecimal("180.00").multiply(new BigDecimal(getSquareFoot())).add(new BigDecimal("0.25").multiply(new BigDecimal(getLotSize())));
        }
        else if (getCondition() == 2) {
            return new BigDecimal("130.00").multiply(new BigDecimal(getSquareFoot())).add(new BigDecimal("0.25").multiply(new BigDecimal(getLotSize())));
        }
        else if (getCondition() == 3) {
            return new BigDecimal("90.00").multiply(new BigDecimal(getSquareFoot())).add(new BigDecimal("0.25").multiply(new BigDecimal(getLotSize())));
        }
        else if (getCondition() == 4) {
            return new BigDecimal("80.00").multiply(new BigDecimal(getSquareFoot())).add(new BigDecimal("0.25").multiply(new BigDecimal(getLotSize())));
        }
        else
            return null;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
