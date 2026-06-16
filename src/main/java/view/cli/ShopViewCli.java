package view.cli;

import view.api.ShopView;

public class ShopViewCli extends CliView implements ShopView {
    // shop list command
    @Override
    public void showShopList() {
        // TODO: implement after the Shop is done.
    }

    // shop daily command
    @Override
    public void showDailyOffer() {
        // TODO: implement after the Shop is done.
    }

    // shop buy command - success
    @Override
    public void showItemPurchased(String itemName, int count, String extraInfo) {
        // TODO: change after the Shop is done.
        String msg = "Successfully purchased " + count + " " + itemName;
        if (extraInfo != null && !extraInfo.isEmpty()) {
            msg += " (" + extraInfo + ")";
        }
        displayMessage(msg + ".");
    }

    // ====================== ERROR METHODS ======================

    @Override
    public void errorInsufficientCoins() {
        displayError("You don't have enough coins.");
    }

    @Override
    public void errorInsufficientDiamonds() {
        displayError("You don't have enough diamonds.");
    }

    @Override
    public void errorItemNotFound(String itemId) {
        displayError("Item '" + itemId + "' not found in shop.");
    }

    @Override
    public void errorDailyOfferAlreadyPurchased() {
        displayError("You have already purchased today's daily offer.");
    }

    @Override
    public void errorMaxCapacityReached(String itemName) {
        displayError("You have reached the maximum capacity for " + itemName + ".");
    }

    @Override
    public void errorPlantTypeRequired() {
        displayError("Plant type (-t) is required for selective seed packets.");
    }

    @Override
    public void errorPlantNotUnlocked(String plantType) {
        displayError("Plant " + plantType + " is not unlocked yet.");
    }

    @Override
    public void errorInvalidBuyCount() {
        displayError("Invalid purchase count.");
    }

    @Override
    public void errorInvalidShopCommand() {
        displayError("Invalid shop command or parameters.");
    }
}