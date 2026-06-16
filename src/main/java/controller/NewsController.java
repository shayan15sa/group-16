package controller;

import model.command.NewsMenuCommands;

import java.util.regex.Matcher;

public class NewsController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (NewsMenuCommands cmd : NewsMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case SHOW_UNREAD -> handleShowUnread();
                case SHOW_ALL -> handleShowAll();
            }
            return;
        }
        view.displayError("Invalid news command.");
    }

    private void handleShowCurrent() {
        // TODO: implement after News is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleShowUnread() {
        // TODO: implement after News is done.
    }

    private void handleShowAll() {
        // TODO: implement after News is done.
    }
}
