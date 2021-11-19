package com.example.izvp.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
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

    }
}
