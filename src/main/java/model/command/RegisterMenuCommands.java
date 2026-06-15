package model.command;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum RegisterMenuCommands implements Command {
    MENU_ENTER("^menu enter\\s+(?<menuName>.+)$"),
    MENU_SHOW_CURRENT("^menu show current$"),
    MENU_EXIT("^menu exit$"),
    REGISTER("^register\\s+-u\\s+(?<username>\\S+)\\s+-p\\s+(?<password>\\S+)\\s+(?<passwordConfirm>\\S+)" +
                    "\\s+-n\\s+(?<nickname>\\S+)\\s+-e\\s+(?<email>\\S+)\\s+-g\\s+(?<gender>\\S+)$"),
    PICK_QUESTION("^pick question\\s+-q\\s+(?<questionNumber>\\S+)\\s+-a\\s+(?<answer>\\S+)\\s+-c\\s+(?<answerConfirm>\\S+)$");

    private final String pattern;

    RegisterMenuCommands(String pattern) {
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