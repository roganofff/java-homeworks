package com.example.fifthlessonseaport.entity;

public class IncomeRent extends Income {

    private float monthlyRentIncome;

    public IncomeRent(int id, String nameIncome, float monthlyRentIncome) {
        super(id, nameIncome);
        this.monthlyRentIncome = monthlyRentIncome;
    }

    @Override
    public float monthlyIncome() {
        return monthlyRentIncome;
    }
}
