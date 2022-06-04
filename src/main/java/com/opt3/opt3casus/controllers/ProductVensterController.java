package com.opt3.opt3casus.controllers;

import com.opt3.opt3casus.HelloApplication;
import com.opt3.opt3casus.objecten.Personen;
import com.opt3.opt3casus.objecten.Producten;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ProductVensterController {
    private Stage stg;
    private Producten product;

    @FXML
    private Label productSoort;



    public ProductVensterController(Producten product, Stage stage){
        this.product = product;
        this.stg = stage;
    }

    //@FXML
    //public static void initialize(){


    //}
    public void setScherm(){
        productSoort.setText(product.getClass().getSimpleName());
    }


}
