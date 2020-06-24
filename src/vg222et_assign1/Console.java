package vg222et_assign1;

/*  This Console shows a Menu in which the user choose to try/test one of the
    seven Exercises from Assignment 1.
    Run the program in your IDE and then enter a number from 1 to 8 to select an
    option and then follow the instructions of every Exercise.
    Enjoy!
*/


import java.util.Scanner;

public class Console {
    private Scanner scanner = new Scanner(System.in);
    public Console() {
    }

    public void displayMenu() {
        System.out.println("---- MENU ----");
        System.out.print(
                "1. Print\n" +
                        "2. Numbers\n" +
                        "3. ISBN\n" +
                        "4. Armstrong Number\n" +
                        "5. Days\n" +
                        "6. Square Root\n" +
                        "7. Fibonacci\n" +
                        "8. Quit\n"
        );

    }
    public boolean choiceFromMenu(){
        System.out.println("Enter a number: ");
        switch (scanner.nextLine()){
            case "1": Print.printMessage(); break;
            case "2": Numbers.doTheMath(); break;
            case "3": ISBN.printISBN(); break;
            case "4": Armstrong.printArmstrongNumber(); break;
            case "5": Days.printDaysOfTheWeek(); break;
            case "6": SquareRoot.calculateSquareRoot(); break;
            case "7": Fibonacci.printFibonacciSequence(); break;
            case "8": System.out.println("QUIT"); return false;
            default: System.out.println("Not a number between 1 and 8.");
        }
        return true;
    }
}