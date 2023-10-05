import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
/* 
 * A homeowner rents out parking spaces in a driveway during special events. The driveway is a “last-in, first-out” stack. 
 * Of course, when a car owner retrieves a vehicle that wasn’t the last one in, the cars blocking it must temporarily move to the street so 
 * that the requested vehicle can leave. Write a program that models this behavior, using one stack for the driveway and one stack for
 *  the street. Use integers as license plate numbers. Positive numbers add a car, negative numbers remove a car, zero stops the simulation.
 *  Print out the stack after each operation is complete. Implement your algorithm in the Driveway class. 
 * Test your algorithm with the DrivewayDemo class. Test with at least the following input:

2
5
6
-5
3
-2
0
Only use the push and pop methods on the stacks. If you want to check for duplicate cars or check that the specified car is in the driveway, you can use the contains method. Use an enhanced for loop when printing the stacks.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */
    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        // Complete the constructor
        driveway = new Stack(); 
        street = new Stack<>(); 


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        driveway.push(licensePlate);


    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
        if (driveway.peek() == licensePlate)
        {
          driveway.pop();
        } 
        else
        {
          while (driveway.peek() != licensePlate)
          {
            Integer last = driveway.pop(); 
            street.push(last); 
          }
          driveway.pop(); 
          while (street.size() > 0)
          {
            driveway.push(street.pop()); 
          }
        }


    }

    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
    {
        System.out.println("In Driveway, starting at first in (one license plate per line):");
        // Print the cars in the driveway here
        for (Integer plates: driveway)
        {
          System.out.println(plates);
        }

        System.out.println("In Street, starting at first in (one license plate per line):");
        // Print the cars in the street here
        for (Integer plates: street)
        {
          System.out.println(street); 
        }

    }
}
