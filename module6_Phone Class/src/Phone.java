/* Scrabble Tile class file for Module 6 Assignment 7
   CS 111B - Lianne Achilles
   This Phone class works with the provided test main function.
*/

public class Phone {
    // declare instance variables
    private String make;
    private String model;
    private String color;
    private int capacity;

    // constructor definitions:
    public Phone()
    {
        // Empty constructor just to allow Phone to be
        // constructed with null strings for its
        // instance variables.
    }
    // constructor to set values for instance variables
    public Phone(String make, String model, String color, int capacity)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getColor() {
        return this.color;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    // The String format of a Phone return make, model, color and capacity.
    public String toString()
    {
        return String.format("%s %s %s with %d GB", make, model, color, capacity);
    }

    // .equals method to compare two Phone objects, returning true if all their attributes are
    // the same.
    public boolean equals(Phone other)
    {
        return make == (other.make) && model == (other.model) && color == (other.color) && capacity == (other.capacity);
    }

}

/* Sample output

The brightest color here is: Phantom Violet
This phone:
Samsung Galaxy S21 5G Phantom Violet with 256 GB
has lower capacity than the:
Apple iPhone 13 Pro Graphite with 512 GB

We have two of these:
Apple iPhone 13 Pro Graphite with 512 GB

After upgrade they aren't equal, because this phone:
Apple iPhone 13 Pro Graphite with 1000 GB
has more capacity than:
Apple iPhone 13 Pro Graphite with 512 GB


Another output when bettoPhone = Phone("Apple", "iPhone 12", "Blue", 64);

The brightest color here is: Phantom Violet
Error! This phone:
Samsung Galaxy S21 5G Phantom Violet with 256 GB
should have lower capacity than the:
Apple iPhone 12 Blue with 64 GB
Error! This phone:
Apple iPhone 13 Pro Graphite with 512 GB
should be equal to:
Apple iPhone 12 Blue with 64 GB
After upgrade they aren't equal, because this phone:
Apple iPhone 13 Pro Graphite with 1000 GB
has more capacity than:
Apple iPhone 12 Blue with 64 GB


*/
