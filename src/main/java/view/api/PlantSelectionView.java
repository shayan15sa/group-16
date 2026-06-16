package view.api;

import model.game.entity.Plant;

import java.util.List;

public interface PlantSelectionView extends View {
    void showAllPlants(List<Plant> plants);

    void showAvailablePlants(List<Plant> plants);

    void errorPlantNotFound();

    void errorPlantAlreadySelected();

    void errorPlantNotSelected();

    void showGameStarted();
}
