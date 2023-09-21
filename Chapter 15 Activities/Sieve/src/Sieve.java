import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        Set <Integer> numbers = new HashSet<>(); 
        for(int x = 2; x <n+1; x++)
        {
            numbers.add(x); 
        }

        Iterator <Integer> iterator = numbers.iterator(); 
        for(int divNum = 2; divNum < n+1; divNum++)
        {
            int num = iterator.next(); 
            if (num%divNum==0)
            {
                
            }
        }


        // Your work goes here
        . . .







    }
}
