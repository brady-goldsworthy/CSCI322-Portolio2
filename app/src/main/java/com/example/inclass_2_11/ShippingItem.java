package com.example.inclass_2_11;

/*
    Brady Goldsworthy z1816747
            and
    Justin Dupre z1835941

    Portfolio 2
    2/11/19
 */


public class ShippingItem {
    //Constants
    static final Double BASE_AMOUNT = 3.00,
                        ADDED_COST = 0.50,
                        EXTRA_OUNCES = 4.00;
    static final int BASE_WEIGHT = 16;

    //Variables
    private Integer weight;
    private Double baseCost, addedCost, totalCost;

    public ShippingItem() {
        weight = 0;
        baseCost = BASE_AMOUNT;
        addedCost = 0.0;
        totalCost = 0.0;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
        computeCost();
    }

    private void computeCost() {
        baseCost = BASE_AMOUNT;
        if (weight <= 0) {
            baseCost = 0.0;
        }

        //calculate additional cost
        addedCost = 0.0;
        if (weight > BASE_WEIGHT) {
            addedCost = Math.ceil((weight - BASE_WEIGHT) / EXTRA_OUNCES) * ADDED_COST;
        }

        //Calculate total cost
        totalCost = baseCost + addedCost;
    }

    public Double getBaseCost() {
        return baseCost;
    }

    public Double getAddedCost() {
        return addedCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

}
