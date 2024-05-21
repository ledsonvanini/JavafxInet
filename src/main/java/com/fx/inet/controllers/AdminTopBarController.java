package com.fx.inet.controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminTopBarController implements Initializable {
    @FXML
    public FontAwesomeIconView btn_admin_min;
    @FXML
    public FontAwesomeIconView btn_admin_close;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void exitSystem() {
        Stage stage = (Stage) this.btn_admin_close.getScene().getWindow();
        stage.close();
        Platform.exit();
        System.exit(1);
    }

    public void minWindow() {
        Stage stage = (Stage) this.btn_admin_min.getScene().getWindow();
        stage.setIconified(true);
    }
}
