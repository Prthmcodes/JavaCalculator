import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to Simple Calculator!");

        while (keepRunning) {
            System.out.println("\nEnter first number:");
            double num1 = sc.nextDouble();

            System.out.println("Enter an operator (+, -, *, /):");
            char operator = sc.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = sc.nextDouble();

            double result;

            // Perform calculation
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    continue; // skip to next iteration
                }
            } else {
                System.out.println("Invalid operator!");
                continue; // skip to next iteration
            }

            System.out.println("Result: " + result);
            System.out.println("Do you want to perform another calculation? (yes/no)");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("no")) {
                keepRunning = false;
            }
        }

        System.out.println("Thank you for using Simple Calculator!");
        sc.close();
    }
}
