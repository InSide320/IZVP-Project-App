package com.example.izvp.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.izvp.DatebaseHandler;
import com.example.izvp.user.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private PasswordField signUpLstName;

    @FXML
    private TextField signUpCountry;

    @FXML
    private RadioButton signUpRadioBoxMale;

    @FXML
    private ToggleGroup selectedGender;

    @FXML
    private RadioButton signUpRadioBoxFemale;

    @FXML
    void initialize() {

        signUpButton.setOnAction(event -> {

            signUpNewUser();

        });
    }

    private void signUpNewUser() {
        DatebaseHandler datebaseHandler = new DatebaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpName.getText();
        String userName = signUpName.getText();
        String password = signUpName.getText();
        String location = signUpName.getText();
        String gender = "";
        if (signUpRadioBoxMale.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName, lastName, userName,
                password, location, gender);

        datebaseHandler.signUpUser(user);
    }
}
