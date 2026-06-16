package controller;

import model.command.GreenhouseMenuCommands;

import java.util.regex.Matcher;

public class GreenhouseController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (GreenhouseMenuCommands cmd : GreenhouseMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case SHOW_GREENHOUSE -> handleShowGreenhouse();
                case PLANT_POT_AT -> handlePlantPotAt(matcher.group("x"), matcher.group("y"));
                case COLLECT -> handleCollect(matcher.group("x"), matcher.group("y"));
                case GROW -> handleGrow(matcher.group("x"), matcher.group("y"));
                case ENTER_SHOP -> handleEnterShop();
            }
            return;
        }
        view.displayError("Invalid greenhouse command.");
    }

    private void handleShowCurrent() {
        // TODO: implement after Greenhouse is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleShowGreenhouse() {
        // TODO: implement after Greenhouse is done.
    }

    private void handlePlantPotAt(String x, String y) {
        // TODO: implement after Greenhouse is done.
    }

    private void handleCollect(String x, String y) {
        // TODO: implement after Greenhouse is done.
    }

    private void handleGrow(String x, String y) {
        // TODO: implement after Greenhouse is done.
    }

    private void handleEnterShop() {
        // TODO: implement after Greenhouse is done.
    }
}
