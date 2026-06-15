package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum SettingMenuCommands implements Command {
    MENU_SHOW_CURRENT("^menu show current$"),
    MENU_EXIT("^menu exit$"),
    CHANGE_DIFFICULTY("^menu settings change-difficulty\\s+-l\\s+(?<difficultyLevel>\\S+)$");

    private final String pattern;

    SettingMenuCommands(String pattern) {
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