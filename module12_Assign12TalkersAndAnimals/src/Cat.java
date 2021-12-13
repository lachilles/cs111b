/* Lianne Achilles Dog.java - CS 111B
   Example to show inheritance from abstract Animal

   This class represents a Cat with a name (inherited from Animal) and a range.
   It inherits the public getName method from Animal and implements speak method from Talker.
*/

class Cat extends Animal
        implements Talker
{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak()
    {
        System.out.println("Meow!");
    }
}
