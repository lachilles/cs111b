/* Craig Persiko - CS 111B
   Test program for Assignment 10 ShapeHierarchy.
   Uses Shape, Circle, Rectangle, and Square.

   YOUR JOB IS TO WRITE THE Circle, Rectangle,
   and Square CLASSES SO THIS PROGRAM
   PRODUCES THE OUTPUT SHOWN AT BOTTOM.

   DO NOT CHANGE THIS FILE
*/

class Main
{
    public static void main(String[] args)
    {
        // Array to store all types of Shape objects:
        Shape[] shapes = new Shape[4];
        // Parallel array to store text descriptions of each shape.
        String[] descriptions = new String[4];

        shapes[0] = new Circle(10);
        descriptions[0] = "10 unit radius Circle";
        shapes[1] = new Rectangle(15, 25);
        descriptions[1] = "15x25 Rectangle";
        shapes[2] = new Square(20);
        descriptions[2] = "20 unit Square";
        shapes[3] = new Circle(2);
        descriptions[3] = "2 unit radius Circle";

        System.out.println("This program examines the ratio of area to perimeter");
        System.out.println("for a few different shapes.");
        System.out.println("(The larger the ratio, the greater the efficiency of space contained)");
        for(int i=0; i<shapes.length && i<descriptions.length; i++)
        {
            System.out.println("Shape #" + shapes[i].getId()
                    + " is a " + descriptions[i] + " with ratio "
                    + shapes[i].area() / shapes[i].perimeter());
        }
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
