package controller;

import model.command.ShopMenuCommands;
import view.api.ShopView;

import java.util.regex.Matcher;

public class ShopController extends ViewController {
    @Override
    public void handleCommand(String input) {
        for (ShopMenuCommands cmd : ShopMenuCommands.values()) {
            Matcher matcher = cmd.getMatcher(input);
            if (matcher == null)
                continue;

            switch (cmd) {
                case MENU_SHOW_CURRENT -> handleShowCurrent();
                case MENU_EXIT -> handleMenuExit();
                case SHOP_LIST -> handleShopList();
                case SHOP_DAILY -> handleShopDaily();
                case SHOP_BUY -> handleShopBuy(matcher.group("itemId"), matcher.group("count"),
                        matcher.group("plantType"));
            }
            return;
        }
        getShopView().errorInvalidShopCommand();
    }

    private void handleShowCurrent() {
        // TODO: implement after Shop is done.
    }

    private void handleMenuExit() {
        // TODO: implement after menu navigation is done.
    }

    private void handleShopList() {
        // TODO: implement after Shop is done.
    }

    private void handleShopDaily() {
        // TODO: implement after Shop is done.
    }

    private void handleShopBuy(String itemId, String count, String plantType) {
        // TODO: implement after Shop is done.
    }

    private ShopView getShopView() {
        return (ShopView) view;
    }
}
