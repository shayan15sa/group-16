package view.cli;

import view.api.View;

public class CliView implements View {
    @Override
    public void displayMessage(String line) {
        System.out.println(line);
    }

    @Override
    public void displayError(String line) {
        System.out.println(line);
    }
}
