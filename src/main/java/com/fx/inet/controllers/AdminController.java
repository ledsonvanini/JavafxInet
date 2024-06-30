package com.fx.inet.controllers;

import com.fx.inet.entities.Client;
import com.fx.inet.services.StageService;
import javafx.application.Platform;
import javafx.beans.DefaultProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
    @FXML
    public BorderPane admRightSide;
    @FXML
    public AnchorPane admPermissionSection;
    @FXML
    public VBox clientsList;
    @FXML
    public VBox subMenu;

    final private FXMLLoader fxmlLoader = new FXMLLoader();

    private List<Client> clients = new ArrayList<>();

    private String selectedOption = null;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            clients.add(new Client(1, "Isaque Santos", "PC - 1"));
            clients.add(new Client(2, "Ledson Vanini", "PC - 2"));
            clients.add(new Client(3, "Maria", "PC - 3"));

            for (Client client : clients) {
                createClientItemFromList(client);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void getClientPermissions(Client client) {
        Label label = (Label) StageService.parentLoaded.lookup("#userFullnameValue");
        label.setText(client.fullName);
    }

    public void createClientItemFromList(Client client) {
        Button button = new Button();
        button.setText(client.machineName);
        button.getStyleClass().add("adm_menu_button");

        button.setOnAction((event) -> {
            getClientPermissions(client);
        });

        VBox parent = null;

        if (subMenu != null) {
            parent = (VBox) ((ScrollPane) subMenu.lookup("AnchorPane ScrollPane")).getContent().lookup("#clientsList");
            //parent = (VBox) subMenu.lookup("#userFullnameValue"); - QUEREMOS ASSIM MAS NÃO FUNCIONA :(
        }

        if (parent != null) {
            parent.getChildren().add(button);
        }
    }

    @FXML
    public void getAdmRightSideScreen() {
        fxmlLoader.setLocation(getClass().getResource("/fxml/admin/AdmRightSide.fxml"));

        try {
            fxmlLoader.load();
        } catch (IOException ex) {
            System.out.println(fxmlLoader.getResources().getClass());
        }
    }
}
