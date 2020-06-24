package vg222et_assign1;

/*  The program prompts user to enter two non-negative integer values:
    The first value is for today’s day of the week and must be from 0 to 6, for today’s day of the
    week. The program should display an appropriate error message if the entered value is not
    from 0 to 6.
    The second value is to compute the future day. The future day is computed by adding the
    second value to the first value.
    The program should then determine and print today’s day of the week and the future day of
    the week based on codes as follows: Sunday is 0, Monday is 1, ..., and Saturday is 6.
*/

import java.util.Scanner;

public class Days {

        public static void printDaysOfTheWeek () {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first non-negative number, between 0 and 6, where:\n 0 = Sunday, 1 = Monday, 2 = Tuesday, ... 6 = Saturday");
            int day1 = scanner.nextInt();
            System.out.println("Enter the second non-negative number");
            int day2 = scanner.nextInt();
            int futureDayOfTheWeek = Math.abs((day2 + day1) % 7);


            if (day1 < 0 || day1 > 6)
                System.out.println("\033[31;1mThe first number has to be a number between 0 and 6, please re-run the program and try again\033[0m\n");
            else if (day2 < 0)
                System.out.println("\033[31;1mThe second number has to be a non-negative number, please re-run the program and try again\033[0m\n");
            else
                switch (futureDayOfTheWeek) {
                    case 0:
                        System.out.println("\033[36;1mSunday\033[0m\n");
                        break;
                    case 1:
                        System.out.println("\033[36;1mMonday\033[0m\n");
                        break;
                    case 2:
                        System.out.println("\033[36;1mTuesday\033[0m\n");
                        break;
                    case 3:
                        System.out.println("\033[36;1mWednesday\033[0m\n");
                        break;
                    case 4:
                        System.out.println("\033[36;1mThursday\033[0m\n");
                        break;
                    case 5:
                        System.out.println("\033[36;1mFriday\033[0m\n");
                        break;
                    case 6:
                        System.out.println("\033[36;1mSaturday\033[0m\n");
                        break;

                }

        }
}
