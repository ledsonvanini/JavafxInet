package com.fx.inet.scenes;

import com.fx.inet.controllers.AdminController;
import com.fx.inet.controllers.LoginController;
import com.fx.inet.services.StageService;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class ViewFactory {
    public void showAdminView() {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/admin/Admin.fxml"));

        AdminController adminController = new AdminController();
        loader.setController(adminController);

        StageService.createStage(loader);
    }

    public void showLoginWindow() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/Login.fxml"));

            LoginController loginController = new LoginController();
            loader.setController(loginController);
            StageService.createStage(loader);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void closeStage(Stage stage) {
        stage.close();
    }
}