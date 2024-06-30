package com.fx.inet.services;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StageService {
    public static Parent parentLoaded = null;

    public static void createStage(FXMLLoader loader) {
        Scene scene = null;

        try {
            StageService.parentLoaded = loader.load();
            scene = new Scene(StageService.parentLoaded);
            scene.setFill(Color.TRANSPARENT);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Stage stage = new Stage();
        stage.setScene(scene);

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setTitle("Inet Server System");
        stage.show();

    }
}
