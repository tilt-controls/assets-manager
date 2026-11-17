package com.pluralsight;
import java.math.BigDecimal;
import java.time.*;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public BigDecimal getValue() {
        int vehicleAge = Year.now().getValue() - getYear();
        BigDecimal reducedValue;
        if (vehicleAge <= 3) {
            reducedValue = new BigDecimal(vehicleAge).multiply((new BigDecimal("0.03"))).subtract(new BigDecimal("1"));
        } else if (vehicleAge <= 6) {
            reducedValue = new BigDecimal(vehicleAge).multiply((new BigDecimal("0.06"))).subtract(new BigDecimal("1"));
        } else if (vehicleAge <= 10) {
            reducedValue = new BigDecimal(vehicleAge).multiply((new BigDecimal("0.08"))).subtract(new BigDecimal("1"));
        } else {
            reducedValue = new BigDecimal("1000.00");
        }
        if (getOdometer() >= 100000) {
            if (getMakeModel().contains("honda") || getMakeModel().contains("toyota") {
                return getOriginalCost().multiply(reducedValue);
            } else {
                return getOriginalCost().multiply(reducedValue).multiply(new BigDecimal("0.25"));
            }
        }
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
