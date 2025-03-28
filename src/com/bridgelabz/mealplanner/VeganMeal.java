package com.bridgelabz.mealplanner;

public class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegan Meal: " + mealName);
    }
}
