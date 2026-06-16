package controller;

import view.cli.AuthViewCli;

import java.util.Scanner;

public class CommandParser {
    private ViewController currentController;

    public CommandParser() {
        RegistrationController registrationController = new RegistrationController();
        registrationController.setView(new AuthViewCli());
        switchController(registrationController);
    }

    public void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                parseAndExecute(scanner.nextLine());
            }
        }
    }

    public void parseAndExecute(String input) {
        if (input == null || currentController == null) {
            return;
        }

        String trimmed = input.trim();
        if (trimmed.isEmpty()) {
            return;
        }
        currentController.handleCommand(trimmed);
    }

    public void switchController(ViewController newController) {
        if (newController == null)
            return;

        this.currentController = newController;
        newController.setParser(this);
        newController.displayMenu();
    }
}
