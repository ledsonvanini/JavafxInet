package com.fx.inet.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    // FXML Admin Side Menu
    @FXML
    public Button btnDevices;
    @FXML
    public Button btnPermissions;
    @FXML
    public Button btnLogs;
    public Button btnSettings;
    public Button btnDisconect;
    public Label btnCredit;
    // FXML Admin Pane
    public BorderPane adminScreen;
    public BorderPane admRightSide;
    public AnchorPane admPermissionSection;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        btnDevices.setOnAction(e -> {
//            System.out.println(btnDevices.getClass().getName());
//        });

//            getAdmRightSideScreen();


    }
    @FXML
    public  void getAdmRightSideScreen(){
//        FXMLLoader section
        System.out.println(btnPermissions);
        FXMLLoader fxmlLoader =  new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/admin/AdmRightSide.fxml"));
        try {
           fxmlLoader.load();

        } catch (IOException ex) {
//           throw new RuntimeException(ex);
            System.out.println(fxmlLoader.getResources().getClass());
        }


    }
    @FXML
    public void getPermissionScreen() {

    }

    public void toggleSection(FXMLLoader loader) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/fxml/admin/AdmPermissionScreen.fxml"));
        System.out.println(btnPermissions);
        try {
            fxmlLoader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void toggleSection(ActionEvent actionEvent) {
    }
}
