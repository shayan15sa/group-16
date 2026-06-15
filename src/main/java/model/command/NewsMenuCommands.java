package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum NewsMenuCommands implements Command {
    MENU_SHOW_CURRENT("^menu show current$"),
    MENU_EXIT("^menu exit$"),
    SHOW_UNREAD("^menu news show-unread$"),
    SHOW_ALL("^menu news show-all$");

    private final String pattern;

    NewsMenuCommands(String pattern) {
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