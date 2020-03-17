//Collin Gee - Lab 06 Software Engineering File Upload

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        //initialize the scanner
        Scanner scanner = new Scanner(System.in);

        //ask for the 2 operands and store them as doubles
        System.out.print("Enter first operand: ");
        double input1 = scanner.nextDouble();

        System.out.print("Enter second operand: ");
        double input2 = scanner.nextDouble();

        //print out the calculator menu
        System.out.println();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println();

        //ask which operand to use from the calculator
        System.out.print("Which operation do you want to perform? ");
        int operation = scanner.nextInt();

        //check if the operation being put in is a valid number
        if (operation < 1 | operation > 4) {
            System.out.println("Error: Invalid selection! Terminating program.");
        }

        //check the number of the operation and perform that function
        if (operation == 1) {
            System.out.println("The result of the operation is " + (input1+input2) + ". Goodbye!");
        }
        if (operation == 2) {
            System.out.println("The result of the operation is " + (input1-input2) + ". Goodbye!");
        }
        if (operation == 3) {
            System.out.println("The result of the operation is " + (input1*input2) + ". Goodbye!");
        }
        if (operation == 4) {
            System.out.println("The result of the operation is " + (input1/input2) + ". Goodbye!");
        }
    }
}
