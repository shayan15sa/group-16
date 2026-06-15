package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ShopMenuCommands implements Command {
    MENU_SHOW_CURRENT("^menu show current$"),
    MENU_EXIT("^menu exit$"),
    SHOP_LIST("^shop list$"),
    SHOP_DAILY("^shop daily$"),
    SHOP_BUY("^shop buy\\s+-i\\s+(?<itemId>\\S+)\\s+-n\\s+(?<count>\\S+)(?:\\s+-t\\s+(?<plantType>.+))?$");

    private final String pattern;

    ShopMenuCommands(String pattern) {
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