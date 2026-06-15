package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum MainMenuCommands implements Command {
    MENU_ENTER("^menu enter\\s+(?<menuName>.+)$"),
    MENU_SHOW_CURRENT("^menu show current$"),
    LOGOUT("^menu logout$");

    private final String pattern;

    MainMenuCommands(String pattern) {
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