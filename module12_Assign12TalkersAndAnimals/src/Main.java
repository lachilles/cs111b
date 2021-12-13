/* Assignment 12 - Talkers And Animals - CS 111B - Craig Persiko
   This Main class tests abstract class Animal and its 3 subclasses:
   Dog, Cat, and Fish.
   It also tests the Talkers: Dog, Cat, and Radio.

   Your job is write the Talker interface, Animal abstract class,
   plus the Dog, Cat, Fish, and Radio classes
   to make this program work, so it produces output like
   the sample shown at bottom.

   DO NOT CHANGE THIS FILE.
*/

import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Scanner keyIn = new Scanner(System.in);
        ArrayList<Talker> chatterbox = new ArrayList<Talker>();
        ArrayList<Animal> menagerie = new ArrayList<Animal>();
        String name, kind, another;

        do
        {
            System.out.print("What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: ");
            kind = keyIn.nextLine();
            switch(kind.charAt(0))
            {
                case 'd': case 'D':
                Dog doggy;
                System.out.print("What is your dog's name? ");
                name = keyIn.nextLine();
                if(name.length() < 1)
                    doggy = new Dog();
                else
                    doggy = new Dog(name);
                chatterbox.add(doggy);
                menagerie.add(doggy);
                break;
                case 'c': case 'C':
                System.out.print("What is your cat's name? ");
                name = keyIn.nextLine();
                Cat myCat = new Cat(name);
                chatterbox.add(myCat);
                menagerie.add(myCat);
                break;
                case 'f': case 'F':
                System.out.print("What is your fish's name? ");
                name = keyIn.nextLine();
                menagerie.add(new Fish(name));
                break;
                case 'r': case 'R':
                chatterbox.add(new Radio());
                break;
                default:
                    System.out.println("Invalid entry.");
            }
            System.out.print("Do you want to enter another? Type y or n: ");
            another = keyIn.nextLine();
        }while(another.charAt(0) == 'y');

        greet(menagerie);
        cacophony(chatterbox);
    }

    // Greet each of the animals
    private static void greet(ArrayList<Animal> animals)
    {
        for(Animal a : animals)
        {
            System.out.println("Hello " + a.getName());
        }
    }

    // Let each of the talkers speak...
    private static void cacophony(ArrayList<Talker> talkers)
    {
        for(Talker t : talkers)
        {
            t.speak();
            System.out.println();
        }
    }
}

/* Sample Output when all the other classes have been written:

What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name?
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name? Franny
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: f
What is your fish's name? Bubbles
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: c
What is your cat's name? Tiger
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: r
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name? Jenny
Do you want to enter another? Type y or n: n
Hello Fido
Hello Franny
Hello Bubbles
Hello Tiger
Hello Jenny
Woof
Woof
Meow
blahblahblah
Woof

*/
