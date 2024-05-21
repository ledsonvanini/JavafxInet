package com.fx.inet.controllers;
import com.fx.inet.views.ViewFactory;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    public FontAwesomeIconView btn_login_close;
    @FXML
    public FontAwesomeIconView btn_login_min;
    @FXML
    public BorderPane scr_login;
    @FXML
    public Button btn_entrar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btn_entrar.setOnAction(event -> onLogin());

    }

    private void onLogin(){
        Stage stage = (Stage) btn_entrar.getScene().getWindow();

        ViewFactory viewFactory = new ViewFactory();
        viewFactory.closeStage(stage);
        viewFactory.getAdminView();
   

    }
    public void exitSystem() {
        Platform.exit();
        System.exit(1);
    }

    public void minWindow() {
        Stage stage = (Stage) btn_login_min.getScene().getWindow();
        stage.setIconified(true);
    }
/*
    public void dragWindow(MouseEvent mouseEvent) {
        scr_login.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Stage primaryStage = getClass().getSta;
                String xOffset = primaryStage.getX() - event.getScreenX();
                yOffset = primaryStage.getY() - event.getScreenY();
            }
        })
    }*/
}
