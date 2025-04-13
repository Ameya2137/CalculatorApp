// Calculator.java

// Name: Ameya Tipnis
// PRN: 23070126012
// Dept: SY-AIML-A1

// Importing Scanner class for input and custom Operations package
import java.util.Scanner;
import Operations.*;

public class Calculator {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // A flag to keep the calculator running until the user chooses to exit
        boolean keepRunning = true;

         // Loop until user chooses to exit (option 8)
        while (keepRunning) {
            // Displaying the menu
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square");
            System.out.println("6. Cube");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
