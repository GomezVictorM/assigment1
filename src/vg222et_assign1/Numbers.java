package vg222et_assign1;

/*  This program asks the user to enter a three-digit integer number. The program then calculates and prints,
    the sum and product of the three digits the integer consists of.
*/

import java.util.Scanner;

public class Numbers {

    public static void doTheMath() {

        Scanner scanner = new Scanner(System.in);   // The digits are entered and stored as variables three variables (firstNumber, secondNumber and thirdNumber)
        System.out.println("Enter the first of a 3-digit number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second of a 3-digit number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter the third of a 3-digit number");
        int thirdNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber; // Here is where the calculations are done
        int prod = firstNumber * secondNumber * thirdNumber;
        System.out.println("\033[36;1mYour number is " + firstNumber + secondNumber + thirdNumber +"\033[0m"); // Print the results
        System.out.println("\033[36;1m(" + firstNumber + " + " + secondNumber + " + " + thirdNumber + ") = " + sum +"\033[0m");
        System.out.println("\033[36;1m(" + firstNumber + " * " + secondNumber + " * " + thirdNumber + ") = " + prod +"\033[0m\n");
    }
}
