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

            int choice;
            try {
                // Reading user input for menu choice
                choice = sc.nextInt();
            } catch (Exception e) {
                // Handling non-integer inputs
                System.out.println("Invalid input! Please enter a number between 1 and 8.");
                sc.next(); // Clearing the invalid input from the buffer
                continue;  // Skip this loop iteration and show the menu again
            }

            try {
                // Performing operation based on user's choice
                switch (choice) {
                    case 1:
                        // Call perform() method of Addition class
                        Addition.perform(sc);
                        break;
                    case 2:
                        // Call perform() method of Subtraction class
                        Subtraction.perform(sc);
                        break;
                    case 3:
                        // Call perform() method of Multiplication class
                        Multiplication.perform(sc);
                        break;
