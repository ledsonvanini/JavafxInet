package com.fx.inet.views;

import com.fx.inet.controllers.AdminController;
import com.fx.inet.controllers.LoginController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class ViewFactory {
    // Server Views
    public ViewFactory() { }

    public void getAdminView() {
        FXMLLoader adminView = new FXMLLoader();
        adminView.setLocation(getClass().getResource("/fxml/admin/Admin.fxml"));
//        AdminController admController = new AdminController();
//        adminView.setController(admController);

        createStage(adminView);
    }

    public void showLoginWindow() {
           try {
               FXMLLoader loader = new FXMLLoader();
               loader.setLocation(getClass().getResource("/fxml/Login.fxml"));

               LoginController loginController = new LoginController();
               loader.setController(loginController);
               createStage(loader);
           } catch (Exception e) {
                e.printStackTrace();
           }

 }

    private void createStage(FXMLLoader loader){

            Scene scene = null;
            try {
                scene = new Scene(loader.load());
                scene.setFill(Color.TRANSPARENT);


            } catch (Exception e) {
//                System.out.println("Nãooooo");
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setScene(scene);



            stage.initStyle(StageStyle.TRANSPARENT);
            //stage.setIconified(true); // Minimiza janela
            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/inet-ico.png")));
            stage.getIcons().add(icon);
            stage.setTitle("Bem-vindo(a) ao Inet Server System");
            stage.show();
        }
    public void closeStage (Stage stage) {
        stage.close();
    }
}