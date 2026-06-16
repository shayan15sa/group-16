package controller;

import model.command.TravelLogMenuCommands;

import java.util.regex.Matcher;

public class TravelLogController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (TravelLogMenuCommands cmd : TravelLogMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case TRAVEL_LOG_PAGE -> handleTravelLogPage(matcher.group("pageName"));
            }
            return;
        }
        view.displayError("Invalid travel log command.");
    }

    private void handleShowCurrent() {
        // TODO: implement after TravelLog is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleTravelLogPage(String pageName) {
        // TODO: implement after TravelLog is done.
    }
}
