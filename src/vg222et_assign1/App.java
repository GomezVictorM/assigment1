package vg222et_assign1;

public class App {
    private Console console = new Console();

    public App() {
        start();
    }

    public void start() {
        do{
            console.displayMenu();
        } while (console.choiceFromMenu());
    }
}
