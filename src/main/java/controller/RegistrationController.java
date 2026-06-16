package controller;

import model.command.RegisterMenuCommands;
import view.api.AuthView;

import java.util.regex.Matcher;

public class RegistrationController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (RegisterMenuCommands cmd : RegisterMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_ENTER -> handleMenuEnter(matcher.group("menuName"));
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case REGISTER -> handleRegister(matcher.group("username"), matcher.group("password"),
                        matcher.group("passwordConfirm"), matcher.group("nickname"),
                        matcher.group("email"), matcher.group("gender"));
                case PICK_QUESTION -> handlePickQuestion(matcher.group("questionNumber"),
                        matcher.group("answer"), matcher.group("answerConfirm"));
            }
            return;
        }
        getAuthView().displayError("Invalid register command.");
    }

    private void handleMenuEnter(String menuName) {
        // TODO: implement after menu navigation is done.
    }

    private void handleShowCurrent() {
        // TODO: implement after register menu is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleRegister(String username, String password, String passwordConfirm,
                                String nickname, String email, String gender) {
        // TODO: implement after UserDatabase is done.
    }

    private void handlePickQuestion(String questionNumber, String answer, String answerConfirm) {
        // TODO: implement after security question system is done.
    }

    private AuthView getAuthView() {
        return (AuthView) view;
    }
}
