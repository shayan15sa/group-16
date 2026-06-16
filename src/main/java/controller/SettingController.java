package controller;

import model.command.SettingMenuCommands;

import java.util.regex.Matcher;

public class SettingController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (SettingMenuCommands cmd : SettingMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case CHANGE_DIFFICULTY -> handleChangeDifficulty(matcher.group("difficultyLevel"));
            }
            return;
        }
        view.displayError("Invalid settings command.");
    }

    private void handleShowCurrent() {
        // TODO: implement after Settings is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleChangeDifficulty(String difficultyLevel) {
        // TODO: implement after Settings is done.
    }
}
