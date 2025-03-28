package com.bridgelabz.mealplanner;

import java.util.ArrayList;
import java.util.List;

public class MealPlanner {
    private List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        mealPlans.add(meal);
    }

    public void displayMealPlans() {
        for (Meal<? extends MealPlan> meal : mealPlans) {
            meal.showMealDetails();
        }
    }

    // Generic method to validate and generate a meal plan
    public static <T extends MealPlan> Meal<T> generateMealPlan(T meal) {
        System.out.println("Validating and generating meal plan...");
        return new Meal<>(meal);
    }
}
