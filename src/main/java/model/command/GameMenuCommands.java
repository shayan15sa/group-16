package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum GameMenuCommands implements Command {
    MENU_ENTER("^menu enter\\s+(?<menuName>.+)$"),
    MENU_SHOW_CURRENT("^menu show current$"),
    MENU_EXIT("^menu exit$"),
    ENTER_CHAPTER("^menu enter chapter\\s+-c\\s+(?<chapterName>.+)$"),
    GREENHOUSE("^menu greenhouse$"),
    TRAVEL_LOG("^menu travel-log$"),
    LEADERBOARD("^menu leaderboard$"),
    COIN_WALLET("^menu coin-wallet$"),
    GEM_WALLET("^menu gem-wallet$"),
    CHEAT_ADD("^menu cheat add\\s+(?<n>\\S+)\\s+(?<type>\\S+)$");

    private final String pattern;

    GameMenuCommands(String pattern) {
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