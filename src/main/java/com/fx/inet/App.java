package com.fx.inet;

import com.fx.inet.views.ViewFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.getAdminView();

    }

    public static void main(String[] args) {
        launch();
    }

}