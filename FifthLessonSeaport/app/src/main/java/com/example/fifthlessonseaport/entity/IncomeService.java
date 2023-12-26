package com.example.fifthlessonseaport.entity;

public class IncomeService extends Income {

    private int shipsAmount;

    private int serviceCostPerShip;

    public IncomeService(int id, String nameIncome, int shipsAmount, int serviceCostPerShip) {
        super(id, nameIncome);
        this.shipsAmount = shipsAmount;
        this.serviceCostPerShip = serviceCostPerShip;
    }

    @Override
    public float monthlyIncome() {
        return shipsAmount * serviceCostPerShip;
    }
}
