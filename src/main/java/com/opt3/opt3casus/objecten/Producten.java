package com.opt3.opt3casus.objecten;

import com.opt3.opt3casus.HelloApplication;
import javafx.stage.Stage;

import java.util.ArrayList;

public abstract class Producten {
    private Double huurprijs;
    private Double verzekering;
    private boolean opVoorraad;
    public static ArrayList<Producten> productenLijst = new ArrayList<>();

    public Producten(Double huurprijs, Double verzekering, boolean opVoorraad) {
        this.huurprijs = huurprijs;
        this.verzekering = verzekering;
        this.opVoorraad = opVoorraad;
    }





    public static ArrayList<Producten> vulProductenLijst() {
        productenLijst.add(new Personenauto("BMW", 1200, true));
        productenLijst.add(new Personenauto("Mercedes", 1000, true));
        productenLijst.add(new Personenauto("VolksWagen", 1780, true));

        productenLijst.add(new Vrachtauto(50000, 2500, true));
        productenLijst.add(new Vrachtauto(45000, 1850, true));
        productenLijst.add(new Vrachtauto(55750, 3500, true));

        productenLijst.add(new Boormachine("Boch", "EasyDrill", true));
        productenLijst.add(new Boormachine("DeWalt", "18V", true));
        productenLijst.add(new Boormachine("Makita", "DHP", true));
        return productenLijst;
    }

    public static ArrayList<Producten> getProductenLijst() {
        return productenLijst;
    }

    public boolean isOpVoorraad() {
        return opVoorraad;
    }

    public String getProductName(){
        return this.getClass().getSimpleName();
    }



}
