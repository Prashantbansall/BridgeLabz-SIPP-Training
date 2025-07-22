package Generics.PersonalizedMealPlanGenerator;

import java.util.Scanner;

// Interface for all meal plans
interface MealPlan {
    void displayMeals();
}

// Subtype 1: Vegetarian
class VegetarianMeal implements MealPlan {
    public void displayMeals() {
        System.out.println("Vegetarian Meal: Rice, Dal, Salad");
    }
}

// Subtype 2: Vegan
class VeganMeal implements MealPlan {
    public void displayMeals() {
        System.out.println("Vegan Meal: Quinoa, Lentils, Mixed Veggies");
    }
}

// Subtype 3: Keto
class KetoMeal implements MealPlan {
    public void displayMeals() {
        System.out.println("Keto Meal: Chicken, Avocado, Boiled Eggs");
    }
}

// Subtype 4: High-Protein
class HighProteinMeal implements MealPlan {
    public void displayMeals() {
        System.out.println("High-Protein Meal: Grilled Fish, Chickpeas, Brown Rice");
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMealPlan() {
        System.out.println("Generating your personalized meal plan:");
        mealPlan.displayMeals();
    }
}

// Main class
public class MealPlanGenerator {
    public static <T extends MealPlan> void createMealPlan(T mealPlan) {
        Meal<T> meal = new Meal<>(mealPlan);
        meal.generateMealPlan();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose your meal category:");
        System.out.println("1. Vegetarian");
        System.out.println("2. Vegan");
        System.out.println("3. Keto");
        System.out.println("4. High-Protein");
        System.out.print("Enter your choice (1-4): ");

        int choice;
        try {
            choice = Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number between 1-4.");
            scanner.close();
            return;
        }

        switch (choice) {
            case 1:
                createMealPlan(new VegetarianMeal());
                break;
            case 2:
                createMealPlan(new VeganMeal());
                break;
            case 3:
                createMealPlan(new KetoMeal());
                break;
            case 4:
                createMealPlan(new HighProteinMeal());
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }

        scanner.close();
    }
}

