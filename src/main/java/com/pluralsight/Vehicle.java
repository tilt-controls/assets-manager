package com.pluralsight;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
        BigDecimal value;
        BigDecimal rate;
        if (vehicleAge <= 3) {
            rate = new BigDecimal("0.03");
            reducedValue = new BigDecimal("1").subtract(new BigDecimal(vehicleAge).multiply(rate));
            value = getOriginalCost().multiply(reducedValue);
        } else if (vehicleAge <= 6) {
            rate = new BigDecimal("0.06");
            reducedValue = new BigDecimal("1").subtract(new BigDecimal(vehicleAge).multiply(rate));
            value = getOriginalCost().multiply(reducedValue);
        } else if (vehicleAge <= 10) {
            rate = new BigDecimal("0.08");
            reducedValue = new BigDecimal("1").subtract(new BigDecimal(vehicleAge).multiply(rate));
            value = getOriginalCost().multiply(reducedValue);
        } else {
            value = new BigDecimal("1000.00");
        }
        if (getOdometer() > 100000 && !getMakeModel().toLowerCase().contains("honda") && !getMakeModel().toLowerCase().contains("toyota")) {
                return value.multiply(new BigDecimal("0.75")).setScale(2, RoundingMode.HALF_UP);
        } else {
            return value.setScale(2, RoundingMode.HALF_UP);
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
