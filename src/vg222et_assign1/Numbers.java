package vg222et_assign1;

import java.util.Scanner;

public class Numbers {

    public static void doTheMath() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first of a 3-digit number");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second of a 3-digit number");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third of a 3-digit number");
        int thirdNumber = input.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int prod = firstNumber * secondNumber * thirdNumber;
        System.out.println("\033[36;1mYour number is " + firstNumber + secondNumber + thirdNumber +"\033[0m");
        System.out.println("\033[36;1m(" + firstNumber + " + " + secondNumber + " + " + thirdNumber + ") = " + sum +"\033[0m");
        System.out.println("\033[36;1m(" + firstNumber + " * " + secondNumber + " * " + thirdNumber + ") = " + prod +"\033[0m\n");
    }
}
