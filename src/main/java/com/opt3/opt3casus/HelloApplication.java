package com.opt3.opt3casus;

import com.opt3.opt3casus.controllers.MenuController;
import com.opt3.opt3casus.objecten.Personen;
import com.opt3.opt3casus.objecten.Producten;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stg;

    @Override
    public void start(Stage stage) throws IOException {

        Personen.personenLijst();
        Producten.vulProductenLijst();
        stg = stage;

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("overzichtVenster.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Inlog");
        stage.show();


    }

    public void changeScene(String FXML, Stage nieuwe) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(FXML));
        Scene volgende = new Scene(pane);
        nieuwe.setScene(volgende);
    }

    public void ingelogd(String FXML, String title) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(FXML));
        Scene nieuw = new Scene(pane);
        Stage naam = new Stage();
        naam.setScene(nieuw);
        naam.setTitle(title);;
        naam.show();
    }



    public static void main(String[] args) {
        launch();
    }
}