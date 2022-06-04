package com.opt3.opt3casus.controllers;

import com.opt3.opt3casus.HelloApplication;
import com.opt3.opt3casus.objecten.Personen;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;


public class MenuController {


    @FXML
    private Label ingelogde;

    @FXML
    private Button uitlogButton;

    @FXML
    private Button beheerButton;

    @FXML
    private Button overzichtButton;

    @FXML
    private ScrollPane scrollPane;



    /*@FXML
    public void initializeTwee(String title) throws IOException{
        ingelogde.setText(title);
    }

     */

    @FXML
    private void initialize(){
        //Stage stage = (Stage) ingelogde.getScene().getWindow();
        //ingelogde.setText(stage.getTitle());
        Button b = new Button("button");

    }

    @FXML
    private void overzichtButtonAction() throws IOException{
        HelloApplication m = new HelloApplication();
        Stage stage = (Stage) overzichtButton.getScene().getWindow();
        m.changeScene("overzichtVenster.fxml", stage);

    }

    @FXML
    private void closeButtonAction(){
        // get a handle to the stage
        Stage stage = (Stage) uitlogButton.getScene().getWindow();
        // do what you have to do

        Personen ingelogd = Personen.getPersonen(stage.getTitle());
        ingelogd.setIngelogd(false);
        stage.close();
    }

    @FXML
    private void beheerButton(){

    }
}
