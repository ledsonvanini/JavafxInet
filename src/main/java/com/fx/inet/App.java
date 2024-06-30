package com.fx.inet;

import com.fx.inet.scenes.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        ViewFactory viewFactory = new ViewFactory();
        viewFactory.showAdminView();

    }

    public static void main(String[] args) {
        launch();
    }

}