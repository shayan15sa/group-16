package controller;

import model.command.GameMenuCommands;

import java.util.regex.Matcher;

public class GameController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (GameMenuCommands cmd : GameMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_ENTER -> handleMenuEnter(matcher.group("menuName"));
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case ENTER_CHAPTER -> handleEnterChapter(matcher.group("chapterName"));
                case GREENHOUSE -> handleGreenhouse();
                case TRAVEL_LOG -> handleTravelLog();
                case LEADERBOARD -> handleLeaderboard();
                case COIN_WALLET -> handleCoinWallet();
                case GEM_WALLET -> handleGemWallet();
                case CHEAT_ADD -> handleCheatAdd(matcher.group("n"), matcher.group("type"));
            }
            return;
        }
        view.displayError("Invalid game menu command.");
    }

    private void handleMenuEnter(String menuName) {
        // TODO: implement after game menu navigation is done.
    }

    private void handleShowCurrent() {
        // TODO: implement after game menu is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleEnterChapter(String chapterName) {
        // TODO: implement after Adventure is done.
    }

    private void handleGreenhouse() {
        // TODO: implement after Greenhouse is done.
    }

    private void handleTravelLog() {
        // TODO: implement after TravelLog is done.
    }

    private void handleLeaderboard() {
        // TODO: implement after Leaderboard is done.
    }

    private void handleCoinWallet() {
        // TODO: implement after wallet system is done.
    }

    private void handleGemWallet() {
        // TODO: implement after wallet system is done.
    }

    private void handleCheatAdd(String n, String type) {
        // TODO: implement after cheat system is done.
    }
}
