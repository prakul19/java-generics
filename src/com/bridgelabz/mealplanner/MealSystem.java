package com.bridgelabz.mealplanner;

public class MealSystem {
    public static void main(String[] args) {
        // Creating meal objects
        VegetarianMeal vegMeal = new VegetarianMeal("Vegetable Salad");
        VeganMeal veganMeal = new VeganMeal("Tofu");
        KetoMeal ketoMeal = new KetoMeal("Chicken Bowl");
        HighProteinMeal proteinMeal = new HighProteinMeal("Grilled cheese");

        // Using generic method to generate meals
        Meal<VegetarianMeal> meal1 = MealPlanner.generateMealPlan(vegMeal);
        Meal<VeganMeal> meal2 = MealPlanner.generateMealPlan(veganMeal);
        Meal<KetoMeal> meal3 = MealPlanner.generateMealPlan(ketoMeal);
        Meal<HighProteinMeal> meal4 = MealPlanner.generateMealPlan(proteinMeal);

        // Meal Planner Manager
        MealPlanner planner = new MealPlanner();
        planner.addMeal(meal1);
        planner.addMeal(meal2);
        planner.addMeal(meal3);
        planner.addMeal(meal4);

        // Display all meals
        System.out.println("\nPersonalized Meal Plans");
        planner.displayMealPlans();
    }
}

