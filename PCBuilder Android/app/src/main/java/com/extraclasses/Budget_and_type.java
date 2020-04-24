package com.extraclasses;

import com.google.gson.annotations.SerializedName;

public class Budget_and_type {
    @SerializedName("budget")
    private double budget;

    @SerializedName("type")
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
