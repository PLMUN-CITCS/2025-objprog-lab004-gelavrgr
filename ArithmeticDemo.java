// File: ArithmeticDemo.java

public class ArithmeticDemo {
    public static void main(String[] args) {
        // Declare and Initialize Integer Variables
        int num1 = 10; // Initialize num1 with the value 10
        int num2 = 5;  // Initialize num2 with the value 5

        // Declare and Initialize a Double Variable
        double num3 = 3.0; // Initialize num3 with the value 3.0

        // Perform Addition
        int sum = num1 + num2; // Calculate the sum of num1 and num2

        // Perform Subtraction
        int difference = num1 - num2; // Calculate the difference between num1 and num2

        // Perform Multiplication
        int product = num1 * num2; // Calculate the product of num1 and num2

        // Perform Integer Division
        int quotient = num1 / num2; // Calculate the integer division of num1 by num2

        // Perform Modulus Operation
        int remainder = num1 % num2; // Calculate the remainder of the division of num1 by num2

        // Demonstrate Operator Precedence
        int expressionResult = num1 + num2 * 2 - (num1 / num2); 
        // The order of operations is: 
        // 1. Multiplication (num2 * 2)
        // 2. Division (num1 / num2)
        // 3. Addition and Subtraction from left to right

        // Output the Results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult); // Explain order of operations
    }
}
