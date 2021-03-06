package com.example.izvp.Controllers;

import com.example.izvp.Application;
import com.example.izvp.DateBaseHandler;
import com.example.izvp.user.User;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button authSigInButton;

    @FXML
    private Hyperlink forgetPasswordHyperlink;

    @FXML
    private Button loginSignUpButton;

    @FXML
    void initialize() {
        loginSignUpButton.setOnAction(actionEvent -> {
            loginSignUpButton.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/com/example/izvp/signUp.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });

        forgetPasswordHyperlink.setOnAction(actionEvent -> {
            forgetPasswordHyperlink.getScene().getWindow().hide();
            Application application = new Application();
            application.getHostServices().showDocument("https://google.com");
        });

        authSigInButton.setOnAction(event -> {
            String loginText = login_field.getText().trim();
            String loginPassword = password_field.getText().trim();

            if ((!loginText.equals("") && !loginPassword.equals("")) || (login_field.getLength() > 4 && password_field.getLength() > 5))
                loginUser(loginText, loginPassword);
            else {
                System.out.println("Login and password is empty");
                Dialog<String> dialog = new Dialog<>();

                dialog.setTitle("Message");
                dialog.setHeaderText("Results:");
                dialog.setContentText("Login and password is empty");
                dialog.setOnCloseRequest(dialogEvent -> dialog.close());
                dialog.show();
                dialog.getOnCloseRequest();
            }

        });
    }

    private void loginUser(String loginText, String loginPassword) {
        DateBaseHandler dateBaseHandler = new DateBaseHandler();
        User user = new User();
        user.setUserName(loginText);
        user.setPassword(loginPassword);
        ResultSet resultSet = dateBaseHandler.getUser(user);

        int counter = 0;

        try {
            while (resultSet.next()) {
                counter++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (counter >= 1) {
            System.out.println("Success!");
        }
    }
}
