// This is a Java Program programmed to print Pascal's Triangle

// We have to import input output classes
import java.io.*;

// The below line is the main Class
public class AIM {

    // First Method 
    // Finding factorial of a number
    public int factorial(int a)
    {
        // This is an Edge case
        // Factorial of 0 is unity
        if (a == 0)

            // Return 1 if the condition is satisfied
            return 1;

        // else recursively call the function over the
        // number whose factorial is to be computed
        return a * factorial(a - 1);
    }

    // Second Method 
    // The below is the main driver method
    public static void main(String[] args)
    {
        // We're to declare and initialize number whose
        // factorial is to be computed
        int k = 4;

        int a, b;

        // Creating an object of AIM class
        // in the main() method
        AIM g = new AIM();

        // iterating using nested for loop to traverse over
        // matrix

        // The below is outer for loop
        for (a = 0; a <= k; a++) {

            // The below is inner loop 1
            for (b = 0; b <= k - a; b++) {

                // Print white space for left spacing
                System.out.print(" ");
            }

            // The below is inner loop 2
            for (b = 0; b <= a; b++) {

                // nCr formula
                System.out.print(
                    " "
                    + g.factorial(a)
                          / (g.factorial(a - b)
                             * g.factorial(b)));
            }

            // By now, we are done with one row so
            // a new line
            System.out.println();
        }
    }
}
