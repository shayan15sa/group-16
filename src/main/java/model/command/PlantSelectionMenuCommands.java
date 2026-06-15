package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum PlantSelectionMenuCommands implements Command {
    MENU_SHOW_CURRENT("^menu show current$"),
    MENU_EXIT("^menu exit$"),
    SHOW_ALL_PLANTS("^show all plants$"),
    SHOW_AVAILABLE_PLANTS("^show available plants$"),
    ADD_PLANT("^add plant\\s+-t\\s+(?<type>.+)$"),
    REMOVE_PLANT("^remove plant\\s+-t\\s+(?<type>.+)$"),
    BOOST_PLANT("^boost plant\\s+-t\\s+(?<type>.+)$"),
    START_GAME("^start game$");

    private final String pattern;

    PlantSelectionMenuCommands(String pattern) {
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