// Copyright CompuScholar, Inc.
// Do not distribute or post in any public or private venue.

// The student should add their algorithm logic in the commented area.
import java.util.*;

class Person {
    int mealsNeeded;  // track how many meals this Person needs to eat
    int safetyCheck;  // help break out of infinite loops

    // constructor requires the day of the week
    public Person(int dayOfWeek) {
        // initialize random number generator with day of week
        Random rand = new Random(dayOfWeek);

        // calculate random number of meals (0 - 5)
        mealsNeeded = rand.nextInt(6);
        System.out.println("I need to eat " + mealsNeeded + " meals");

        safetyCheck = 0;  // initialize safety counter
    }

    // This method returns true if this Person still needs to eat meals.
    // An exception is thrown if you call it too many times.
    public boolean isHungry() throws Exception {
        safetyCheck++;
        if (safetyCheck > 10) {
            throw new Exception("Too many loop iterations");
        }
        return mealsNeeded > 0;
    }

    // This method reduces the number of meals this Person still needs to eat
    // and prints a message describing where this meal came from.
    // An error message is printed if you try to eat and you are not hungry.
    public void eatMeal(String source) {
        if (mealsNeeded > 0) {
            System.out.println("Yummy - " + source);
            mealsNeeded--;
        } else {
            System.out.println("ERROR: I am not hungry");
        }
    }
}
