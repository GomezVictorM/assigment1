package vg222et_assign1;

/*  This program prompts user to enter a range for Armstrong numbers.
    The range is entered by asking user to enter a starting and an ending number for the range.
    The program then computes and prints Armstrong number, if any, in the entered range.
*/

import java.util.Scanner;

public class Armstrong {

    public static void printArmstrongNumber() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the starting number in range. This number must be higher than 10");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the ending number");
            int secondNumber = scanner.nextInt();


            for (int k = firstNumber; k <= secondNumber; k++) {
                if (armstrong(k)) {
                    System.out.println(k + "\033[36;1m is an Armstrong number\033[0m");
                } else {

                }
            }

    }


        public static boolean armstrong ( int number) {
            int digitsInNumber = String.valueOf(number).length();
            int sum = 0;
            int value = number;
            for (int k = 1; k <= digitsInNumber; k++) {
                int digit = value % 10; // I had to ask my friend with this, line 33 and lines between line 37 and 39 because I could not figure out myself how to do it
                value = value / 10;
                sum = sum + (int) Math.pow(digit, digitsInNumber);
            }

            if (sum == number)
                return true;
            else
                return false;


        }

}



