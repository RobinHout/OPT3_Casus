package com.opt3.opt3casus.controllers;

import com.opt3.opt3casus.HelloApplication;
import com.opt3.opt3casus.objecten.Personen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label label1;

    @FXML
    private Button button;

    @FXML
    private TextField naam;

    @FXML
    private TextField wachtwoord;



    @FXML
    private void checkLogin(ActionEvent event) throws IOException{
        loginButton();
    }

    @FXML
    public void loginButton() throws IOException{
        HelloApplication m = new HelloApplication();
        Personen ingelogd = Personen.checkGegevens(naam.getText(), wachtwoord.getText());
        if (ingelogd != null) {
            label1.setText("Wachtwoord en gebruikersnaam kloppen");
            //m.changeScene("menu.fxml");
            ingelogd.setIngelogd(true);
            m.ingelogd("menu.FXML", ingelogd.getNaam());

        }
        else {
            if (wachtwoord.getText().isEmpty() || naam.getText().isEmpty()) {
                if (naam.getText().isEmpty()) {
                    label1.setText("Voer uw naam in");
                }
                if (wachtwoord.getText().isEmpty()) {
                    label1.setText("Voer uw wachtwoord in");
                }
                if (wachtwoord.getText().isEmpty() && naam.getText().isEmpty()) {
                    label1.setText("Voer uw naam en wachtwoord in");
                }

            } else {
                label1.setText("Gebruikersnaam of wachtwoord is fout");
            }
        }




    }
}