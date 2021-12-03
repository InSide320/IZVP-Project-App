package com.example.izvp.Controllers;

import com.example.izvp.DateBaseHandler;
import com.example.izvp.user.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SignUpController {

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpCountry;

    @FXML
    private RadioButton signUpRadioBoxMale;

    @FXML
    private ToggleGroup selectedGender;

    @FXML
    private RadioButton signUpRadioBoxFemale;

    @FXML
    private TextField signUpLstName;


    @FXML
    void initialize() {

        signUpButton.setOnAction(event -> signUpNewUser());
    }

    private void signUpNewUser() {
        DateBaseHandler datebaseHandler = new DateBaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLstName.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String locetion = signUpCountry.getText();
        String gender = "";
        if (signUpRadioBoxMale.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName, lastName, userName,
                password, locetion, gender);

        datebaseHandler.signUpUser(user);
    }
}
