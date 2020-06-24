package vg222et_assign1;
/*
  A program that prints 3 times on the terminal the phrase "Write once, run everywhere!"
  1) on one line
  2) on four lines, one word on each line
  3) inside a rectangle made up by the characters "*"
 */
public class Print {

    public static void printMessage() {
        System.out.println("Hello! This program prints 3 times on the terminal the phrase 'Write once, run everywhere!'\n\n");
        System.out.println("\033[36;1mWriteWrite once, run everywhere!\n\n");
        System.out.println("\033[36;1mWrite\nonce\nrun\neverywhere!\n\n\033[0m");
        System.out.println("\033[36;1m********************************************\n" +
                "*                                                               *\n" +
                "*   Write once, run everywhere!      *\n" +
                "*                                                               *\n" +
                "********************************************\033[0m\n");
    }
}

