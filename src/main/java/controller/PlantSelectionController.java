package controller;

import model.command.PlantSelectionMenuCommands;

import java.util.regex.Matcher;

public class PlantSelectionController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (PlantSelectionMenuCommands cmd : PlantSelectionMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case SHOW_ALL_PLANTS -> handleShowAllPlants();
                case SHOW_AVAILABLE_PLANTS -> handleShowAvailablePlants();
                case ADD_PLANT -> handleAddPlant(matcher.group("type"));
                case REMOVE_PLANT -> handleRemovePlant(matcher.group("type"));
                case BOOST_PLANT -> handleBoostPlant(matcher.group("type"));
                case START_GAME -> handleStartGame();
            }
            return;
        }
        view.displayError("Invalid plant selection command.");
    }

    private void handleShowCurrent() {
        // TODO: implement after PlantSelection is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleShowAllPlants() {
        // TODO: implement after PlantSelection is done.
    }

    private void handleShowAvailablePlants() {
        // TODO: implement after PlantSelection is done.
    }

    private void handleAddPlant(String type) {
        // TODO: implement after PlantSelection is done.
    }

    private void handleRemovePlant(String type) {
        // TODO: implement after PlantSelection is done.
    }

    private void handleBoostPlant(String type) {
        // TODO: implement after PlantSelection is done.
    }

    private void handleStartGame() {
        // TODO: implement after PlantSelection is done.
    }
}
