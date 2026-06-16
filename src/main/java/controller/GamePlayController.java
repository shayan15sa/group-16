package controller;

import model.command.GamePlayMenuCommands;

import java.util.regex.Matcher;

public class GamePlayController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (GamePlayMenuCommands cmd : GamePlayMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case ADVANCE_TIME -> handleAdvanceTime(matcher.group("count"));
                case COLLECT_SUN -> handleCollectSun(matcher.group("x"), matcher.group("y"));
                case SHOW_SUN_AMOUNT -> handleShowSunAmount();
                case PLANT_PLANT -> handlePlantPlant(matcher.group("type"), matcher.group("x"),
                        matcher.group("y"));
                case PLUCK_PLANT -> handlePluckPlant(matcher.group("x"), matcher.group("y"));
                case FEED_PLANT -> handleFeedPlant(matcher.group("x"), matcher.group("y"));
                case SHOW_MAP -> handleShowMap();
                case SHOW_PLANTS_STATUS -> handleShowPlantsStatus();
                case SHOW_TILE_STATUS -> handleShowTileStatus(matcher.group("x"), matcher.group("y"));
                case ZOMBIES_INFO -> handleZombiesInfo();
                case START_ZOMBIE_WAVES -> handleStartZombieWaves();
                case CHEAT_ADD_SUNS -> handleCheatAddSuns(matcher.group("count"));
                case RELEASE_THE_NUKE -> handleReleaseTheNuke();
                case CHEAT_REMOVE_COOLDOWN -> handleCheatRemoveCooldown();
                case CHEAT_ADD_PLANT_FOOD -> handleCheatAddPlantFood();
                case CHEAT_ADD_ZOMBIE -> handleCheatAddZombie(matcher.group("zombieType"),
                        matcher.group("x"), matcher.group("y"));
            }
            return;
        }
        view.displayError("Invalid gameplay command.");
    }

    private void handleAdvanceTime(String count) {
        // TODO: implement after GameSession is done.
    }

    private void handleCollectSun(String x, String y) {
        // TODO: implement after GameSession is done.
    }

    private void handleShowSunAmount() {
        // TODO: implement after GameSession is done.
    }

    private void handlePlantPlant(String type, String x, String y) {
        // TODO: implement after GameSession is done.
    }

    private void handlePluckPlant(String x, String y) {
        // TODO: implement after GameSession is done.
    }

    private void handleFeedPlant(String x, String y) {
        // TODO: implement after GameSession is done.
    }

    private void handleShowMap() {
        // TODO: implement after GameSession is done.
    }

    private void handleShowPlantsStatus() {
        // TODO: implement after GameSession is done.
    }

    private void handleShowTileStatus(String x, String y) {
        // TODO: implement after GameSession is done.
    }

    private void handleZombiesInfo() {
        // TODO: implement after GameSession is done.
    }

    private void handleStartZombieWaves() {
        // TODO: implement after GameSession is done.
    }

    private void handleCheatAddSuns(String count) {
        // TODO: implement after GameSession is done.
    }

    private void handleReleaseTheNuke() {
        // TODO: implement after GameSession is done.
    }

    private void handleCheatRemoveCooldown() {
        // TODO: implement after GameSession is done.
    }

    private void handleCheatAddPlantFood() {
        // TODO: implement after GameSession is done.
    }

    private void handleCheatAddZombie(String zombieType, String x, String y) {
        // TODO: implement after GameSession is done.
    }
}
