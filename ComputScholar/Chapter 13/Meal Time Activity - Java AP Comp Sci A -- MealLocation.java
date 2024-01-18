// Copyright CompuScholar, Inc.
// Do not distribute or post in any public or private venue.

// The student should add their algorithm logic in the commented area.
import java.util.*;

class MealLocation {
    int mealsLeft;    // tracks how many meals left at this location
    int safetyCheck;  // help break out of infinite loops
    String name;      // Pantry or Refrigerator

    // constructor requires the name and day of the week
    public MealLocation(String thisName, int dayOfWeek) {
        name = thisName;

        // we need the seed value to be different between MealLocation objects
        // but deterministic based on the name.
        int offset = 1;     // this is for "Pantry"
        if (thisName.equalsIgnoreCase("Refrigerator")) {
            offset = 2;
        }

        // initialize random number generator with day of week
        // (plus offset based on the name to be different)
        Random rand = new Random(dayOfWeek + offset);

        // calculate random number of meals (0 - 2)
        mealsLeft = rand.nextInt(3);
        System.out.println(name + " has " + mealsLeft + " meals");

        safetyCheck = 0;  // initialize safety counter
    }

    // This method returns true if there are any meals left.
    // An exception is thrown if you call it too many times.
    public boolean hasMeals() throws Exception {
        safetyCheck++;
        if (safetyCheck > 10) {
            throw new Exception(name + ": Too many loop iterations");
        }
        return mealsLeft > 0;
    }

    // This method reduces the number of available meals at this location.
    // An error message is printed if there are no meals left.
    public void getMeal() {
        if (mealsLeft > 0) {
            mealsLeft--;
        } else {
            System.out.println("ERROR: " + name + " has no remaining meals");
        }
    }
}
