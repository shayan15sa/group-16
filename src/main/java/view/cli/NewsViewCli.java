package view.cli;

import view.api.NewsView;

import java.util.List;

public class NewsViewCli extends CliView implements NewsView {
    // news show-unread command
    // we can get a list of the news object as well.
    // that way, we would have to format them here and can be useful when switching to gui.
    @Override
    public void showUnreadNews(List<String> news) {
        for (String n : news) {
            displayMessage(n);
        }
    }

    // separated because might change the formating later on.
    @Override
    public void showAllNews(List<String> news) {
        for (String n : news) {
            displayMessage(n);
        }
    }
}
