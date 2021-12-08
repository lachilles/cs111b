/* Lianne Achilles Motorboat.java - CS 111B
   Example to show inheritance from abstract Vehicle

   This class represents a Motorboat with make and model
   (inherited from Vehicle) and a range.
   It inherits the public travel method from Vehicle.
*/

import javax.swing.*;

class Motorboat extends Vehicle
        implements LimitedRange
{
    // declare instance variables
    private int range;

    // // constructor definitions:
    // use inherited constructor to store make and model
    // then store range
    public Motorboat(String make, String model, int range)
    {
        // call Vehicle constructor with parameters:
        super(make, model);
    }

    @Override
    public boolean travel(int distance)
    {
        if (distance <= this.range)
            System.out.print("Wisshhh!\n");
        this.range = this.range - distance;
        return true;
    }

    // NEW: This getCurrentRange method is required by
    // the LimitedRange interface we are implementing.
    @Override
    public int getCurrentRange() {
        return this.range;
    }
}
