// Copyright CompuScholar, Inc.
// Do not distribute or post in any public or private venue.

// The student will create this class based on the activity instructions.
class Dog {
    private int numTimesFed;
    final String name;

    public Dog(String name) {
        this.name = name;
        this.numTimesFed = 0;
    }

    public int getNumTimesFed() {
        return numTimesFed;
    }

    public String hear(String sound) {
        if (sound.equals(name)) {
            return name + " wags tail";
        } else if (sound.equals("ding-dong")) {
            return "BARK BARK";
        } else {
            return name + " looks puzzled";
        }
    }
    
    public String feed() {
        numTimesFed++;

        if (numTimesFed <= 2) {
            return "YUMMY";
        } else {
            return name + " yawns";
        }
    }
}
