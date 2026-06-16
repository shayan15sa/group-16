package view.cli;

import view.api.SettingView;

public class SettingViewCli extends CliView implements SettingView {
    @Override
    public void showChangedDifficulty(int difficulty) {
        displayMessage("The difficulty level change to " + difficulty + ".");
    }
}
