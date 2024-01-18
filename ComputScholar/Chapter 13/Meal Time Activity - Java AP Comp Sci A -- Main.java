// Copyright CompuScholar, Inc.
// Do not distribute or post in any public or private venue.

// The student should add their algorithm logic in the commented area.
import java.util.*;

class Main {
    public static void main(String[] args) {
        // gather input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the day of the week (0 - 6): ");
        int dayOfWeek = input.nextInt();
        input.close();

        // safety try/catch in case we need to break out of infinite loop
        try {
            // Create Person, Pantry, and Refrigerator objects, initializing them
            // with the day of the week.
            Person me = new Person(dayOfWeek);
            MealLocation pantry = new MealLocation("Pantry", dayOfWeek);
            MealLocation refrigerator = new MealLocation("Refrigerator", dayOfWeek);

            // Eat food from the Pantry while still hungry
            while (me.isHungry() && pantry.hasMeals()) {
                me.eatMeal("Pantry");
                pantry.getMeal();
            }

            // Eat food from the Refrigerator while still hungry
            while (me.isHungry() && refrigerator.hasMeals()) {
                me.eatMeal("Refrigerator");
                refrigerator.getMeal();
            }

            // Eat food from the Store while still hungry
            while (me.isHungry()) {
                me.eatMeal("Store");
            }

            System.out.println("I am full");  // final message
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
    }
}
