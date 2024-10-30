package com.example.test1;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;

public class SecondPageController {

    @FXML
    public void goToLibrary(ActionEvent event) {
        try {
            // Load the library page (library.fxml)
            Parent libraryPage = FXMLLoader.load(getClass().getResource("library-view.fxml"));
            Stage libraryStage = new Stage();
            libraryStage.setTitle("Library");
            libraryStage.setScene(new Scene(libraryPage));
            libraryStage.show(); // Show the library stage

            // Close the current second stage
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void logout(ActionEvent event) {
        try {
            // Load the login page (login.fxml)
            Parent loginPage = FXMLLoader.load(getClass().getResource("login.fxml"));
            Stage loginStage = new Stage();
            loginStage.setTitle("Login");
            loginStage.setScene(new Scene(loginPage));
            loginStage.show(); // Show the login stage

            // Close the current second stage
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
