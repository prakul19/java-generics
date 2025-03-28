package com.bridgelabz.mealplanner;

public class KetoMeal implements MealPlan {
    private String mealName;

    public KetoMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Keto Meal: " + mealName);
    }
}

