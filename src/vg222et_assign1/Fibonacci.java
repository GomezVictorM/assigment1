package vg222et_assign1;

import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacciSequence() {
        int n1 = 1; // The first 2 digits are given by default
        int n2 = 2;

        System.out.println("This program will print on the terminal The (fixed) Fibonacci Sequence from 1 to a number minor than 1000." +
                "\nThe user enters the number k that represents the number of iterations\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number k not bigger than 15 \033[36;1mhere:\033[0m");
        int k = scanner.nextInt(); // The users enters the number k in which the sequence will end, in this case k must be not higher than 15

        if(k > 15) // By limiting to only the 15 first digits we avoid to exceed the limit of 1000
            System.out.println("\033[31;1mThe number K has to be not higher than 15, please re-reun the program and try again\033[0m\n");
        else {
            System.out.println("\033[36;1mThis is the list of the first " + k + " numbers of the Fibonacci sequence:\033[0m");
            for (int i = 1; i <= k; i++) { // By some reason the program fails when K is higher than 47
                System.out.println("\033[36;1m" + n1 + "\033[0m");
                int sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }

        }
    }
}
