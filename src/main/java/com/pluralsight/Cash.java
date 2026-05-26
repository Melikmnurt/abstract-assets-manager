package com.pluralsight;

// Cash inherits from Asset
public class Cash extends Asset {

    // Constructor
    public Cash(String description,
                String dateAcquired,
                double originalCost) {

        // Call parent constructor
        super(description, dateAcquired, originalCost);
    }

    // Override abstract method
    @Override
    public double getValue() {

        // Cash value never changes
        return getOriginalCost();
    }
}