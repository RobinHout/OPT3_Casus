package com.opt3.opt3casus.controllers;

import com.opt3.opt3casus.HelloApplication;
import com.opt3.opt3casus.objecten.Personen;
import com.opt3.opt3casus.objecten.Producten;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;


public class OverzichtVensterController {

    public void OverzichtVensterController(){

    }


    @FXML
    private Button startButton;

    @FXML
    private ScrollPane scrollVenster;

    @FXML
    private Label persoon;

    @FXML
    private VBox box;

    @FXML
    private Button terug;



    @FXML
    private void setNaam(){
        Stage naam = (Stage) persoon.getScene().getWindow();

        persoon.setText(naam.getTitle());
    }

    @FXML
    private void terugNaarMenu() throws IOException{
        HelloApplication h = new HelloApplication();
        Stage stage = (Stage) terug.getScene().getWindow();
        h.changeScene("menu.fxml", stage);
    }

    public void laatProductZien(Producten product) throws IOException{
        HelloApplication m = new HelloApplication();
        Stage stage = (Stage) terug.getScene().getWindow();

        m.changeScene("productVenster.fxml", stage);
        ProductVensterController controller = new ProductVensterController(product, stage);
        //controller.setScherm();

        //m.changeScene("menu.fxml", stage);
    }

    @FXML
    private void initialize()throws IOException{

        //FXMLLoader loader = new FXMLLoader(getClass().getResource("overzichtVenster.fxml"));
        //FXMLLoader.load(getClass().getResource("overzichtVenster.fxml"));
        vulButtons("niks");
        //Node root = loader.load();

    }


    @FXML
    private void vulButtons(String naam){


        for (int i = 0; i < Producten.getProductenLijst().size(); i++) {
            String buttonName = Producten.getProductenLijst().get(i).getClass().getSimpleName();

            Button b = new Button(buttonName);
            b.setPrefWidth(350);
            b.setMinHeight(50);
            b.setTextAlignment(TextAlignment.LEFT);
            b.setText(buttonName + "    op voorraad: " + Producten.getProductenLijst().get(i).isOpVoorraad());
            Producten nieuw = Producten.getProductenLijst().get(i);
            b.setOnAction((ActionEvent)->{
                try {
                    laatProductZien(nieuw);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            });
            box.getChildren().add(b);
            persoon.setText(naam);
        }

    }
}
