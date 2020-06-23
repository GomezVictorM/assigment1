package vg222et_assign1;

import java.util.Scanner;

public class ISBN {

    public static void printISBN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first of 9 digits of the ISBN number");
        int d1 = scanner.nextInt();
        System.out.println("Enter the second of 9 digits of the ISBN number");
        int d2 = scanner.nextInt();
        System.out.println("Enter the third of 9 digits of the ISBN number");
        int d3 = scanner.nextInt();
        System.out.println("Enter the fourth of 9 digits of the ISBN number");
        int d4 = scanner.nextInt();
        System.out.println("Enter the fifth of 9 digits of the ISBN number");
        int d5 = scanner.nextInt();
        System.out.println("Enter the sixth of 9 digits of the ISBN number");
        int d6 = scanner.nextInt();
        System.out.println("Enter the seventh of 9 digits of the ISBN number");
        int d7 = scanner.nextInt();
        System.out.println("Enter the eighth of 9 digits of the ISBN number");
        int d8 = scanner.nextInt();
        System.out.println("Enter the ninth of 9 digits of the ISBN number");
        int d9 = scanner.nextInt();

        int isbn10 = ((d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11);
        if (isbn10 == 10)
            System.out.println("\033[36;1mThe ISBN-10 number is " +d1+d2+d3+d4+d5+d6+d7+d8+d9 + "X" + "\033[0m\n");
        else
            System.out.println("\033[36;1mThe ISBN-10 number is " +d1+d2+d3+d4+d5+d6+d7+d8+d9 + isbn10 + "\033[0m\n");

    }
}
