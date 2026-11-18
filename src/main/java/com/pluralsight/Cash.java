package com.pluralsight;
import java.math.*;

public class Cash extends Asset{

    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
