package controller;

import model.command.LoginMenuCommands;
import view.api.AuthView;

import java.util.regex.Matcher;

public class LoginController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (LoginMenuCommands cmd : LoginMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_ENTER -> handleMenuEnter(matcher.group("menuName"));
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case LOGIN -> handleLogin(matcher.group("username"), matcher.group("password"),
                        matcher.group("stayLoggedIn"));
                case FORGET_PASSWORD -> handleForgetPassword(matcher.group("username"),
                        matcher.group("email"), matcher.group("answer"));
            }
            return;
        }
        getAuthView().displayError("Invalid login command.");
    }

    private void handleMenuEnter(String menuName) {
        // TODO: implement after menu navigation is done.
    }

    private void handleShowCurrent() {
        // TODO: implement after login menu is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleLogin(String username, String password, String stayLoggedIn) {
        // TODO: implement after UserDatabase is done.
    }

    private void handleForgetPassword(String username, String email, String answer) {
        // TODO: implement after UserDatabase is done.
    }

    private AuthView getAuthView() {
        return (AuthView) view;
    }
}
