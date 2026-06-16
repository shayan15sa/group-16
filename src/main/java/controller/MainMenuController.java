package controller;

import model.command.MainMenuCommands;

import java.util.regex.Matcher;

public class MainMenuController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (MainMenuCommands cmd : MainMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_ENTER -> handleMenuEnter(matcher.group("menuName"));
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case LOGOUT -> handleLogout();
            }
            return;
        }
        view.displayError("Invalid main menu command.");
    }

    private void handleMenuEnter(String menuName) {
        // TODO: implement after main menu navigation is done.
    }

    private void handleShowCurrent() {
        // TODO: implement after main menu is done.
    }

    private void handleLogout() {
        // TODO: implement after UserDatabase is done.
    }
}
