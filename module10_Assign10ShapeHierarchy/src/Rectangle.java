/* Lianne Achilles  -  Rectangle.java
   CS111B Assignment 10
   Defines a class to store data on a Rectangle,
   which is a kind of Shape.
*/

class Rectangle extends Shape
{
    protected int length, height;

    // default constructor:
    // use inherited constructor to assign an id
    public Rectangle()
    {
        // super() is automatically called.
        length = 0;
        height = 0;
    }

    // constructor to set all values (unique id automatically assigned)
    public Rectangle(int l, int h)
    {
        length = l;
        height = h;
    }

    @Override
    public double area()
    {
        return length * height;
    }

    @Override
    public double perimeter()
    {
        return 2 * (length + height);
    }
}

/* Output:

This program examines the ratio of area to perimeter
for a few different shapes.
(The larger the ratio, the greater the efficiency of space contained)
Shape #1 is a 10 unit radius Circle with ratio 5.0
Shape #2 is a 15x25 Rectangle with ratio 4.6875
Shape #3 is a 20 unit Square with ratio 5.0
Shape #4 is a 2 unit radius Circle with ratio 1.0

*/
