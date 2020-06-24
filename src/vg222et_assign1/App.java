package vg222et_assign1;

/*  This App runs a Console inside a Console Class.
    Run the program and follow the instructions.
    Enjoy!
*/

public class App {
    private Console console = new Console();     // Here we call the Console

    public App() {              // Call the method start() inside App()
        start();
    }

    public void start() {           // Method start() calls the method displayMenu() inside the Class Console
        do{
            console.displayMenu();
        } while (console.choiceFromMenu());
    }
}
