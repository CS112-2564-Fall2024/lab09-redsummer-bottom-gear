package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.WindowEvent;

import static cs112.lab09.Constants.HISTORICAL_DATA;
import static cs112.lab09.Constants.REDSUMMER_IMAGE_PATH;

public class CityController {
    @FXML
    Label locationLabel;
    public void initData(Constants.Event eventIndex){
        String[] data = HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
        event.getImage();
    }

    public void handleCloseWindow(WindowEvent e){
        dispose();
    }
}
