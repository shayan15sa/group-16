package controller;

import model.command.ProfileMenuCommands;

import java.util.regex.Matcher;

public class ProfileController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (ProfileMenuCommands cmd : ProfileMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null) 
                continue;
            
            switch (cmd) {
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case CHANGE_USERNAME -> handleChangeUsername(matcher.group("username"));
                case CHANGE_NICKNAME -> handleChangeNickname(matcher.group("nickname"));
                case CHANGE_EMAIL -> handleChangeEmail(matcher.group("email"));
                case CHANGE_PASSWORD -> handleChangePassword(matcher.group("newPassword"),
                        matcher.group("oldPassword"));
                case SHOW_INFO -> handleShowInfo();
            }
            return;
        }
        view.displayError("Invalid profile command.");
    }

    private void handleShowCurrent() {
        // TODO: implement after Profile is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleChangeUsername(String username) {
        // TODO: implement after Profile is done.
    }

    private void handleChangeNickname(String nickname) {
        // TODO: implement after Profile is done.
    }

    private void handleChangeEmail(String email) {
        // TODO: implement after Profile is done.
    }

    private void handleChangePassword(String newPassword, String oldPassword) {
        // TODO: implement after Profile is done.
    }

    private void handleShowInfo() {
        // TODO: implement after Profile is done.
    }
}
