package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum CollectionMenuCommands implements Command {
    MENU_SHOW_CURRENT("^menu show current$"),
    MENU_EXIT("^menu exit$"),
    SHOW_PLANTS("^menu collection show-plants$"),
    SHOW_ALL_PLANTS("^menu collection show-all-plants$"),
    SHOW_ZOMBIES("^menu collection show-zombies$"),
    SHOW_ALL_ZOMBIES("^menu collection show-all-zombies$"),
    SHOW_PLANT("^menu collection show-plant\\s+-p\\s+(?<plantName>.+)$"),
    SHOW_ZOMBIE("^menu collection show-zombie\\s+-z\\s+(?<zombieName>.+)$"),
    UPGRADE_PLANT("^menu collection upgrade-plant\\s+-p\\s+(?<plantName>.+)$"),
    PURCHASE_PLANT("^menu collection purchase-plant\\s+-p\\s+(?<plantName>.+)$");

    private final String pattern;

    CollectionMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);

        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }
}