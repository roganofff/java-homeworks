package com.example.fifthlessonseaport.entity;

public class Income {

    private int id;

    private String nameIncome;

    public Income(int id, String nameIncome) {
        this.id = id;
        this.nameIncome = nameIncome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameIncome() {
        return nameIncome;
    }

    public void setNameIncome(String nameIncome) {
        this.nameIncome = nameIncome;
    }

    public float monthlyIncome() {
        return -1;
    }
}
