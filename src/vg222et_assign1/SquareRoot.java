package vg222et_assign1;

/* This program prompts user to enter an integer value for n, iterates through the Babylonian algorithm
    until the guess is within 1% of the previous guess and outputs the answer as a real number to two decimal places.
*/

import java.util.Scanner;

public class SquareRoot {
    public static double calculateSquareRoot() {
        double error = 0.01;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer to estimate the square roots");
        double number = scanner.nextDouble();
        double guessedNumber = (number / 2);
        if (number <= 0) { // Number > 0 inorder to avoid errors, this program does not calculate imaginary numbers
            System.out.println("\033[31;1mThe number has to be positive, please re-reun the program and try again\033[0m\n");
        } else {

            while (guessedNumber - (number / guessedNumber) > error) {
                guessedNumber = (guessedNumber + (number / guessedNumber)) / 2;
                System.out.println("\033[36;1m" + guessedNumber + "\033[0m");
                System.out.println("Error" + (guessedNumber - (number / guessedNumber)));
            }
        }
                System.out.println("Error" + (guessedNumber - (number / guessedNumber)));
                return guessedNumber;


    }
}
