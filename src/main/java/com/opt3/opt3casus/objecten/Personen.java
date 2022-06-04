package com.opt3.opt3casus.objecten;

import java.util.ArrayList;

public class Personen {
    public String naam;
    public String wachtwoord;
    public boolean ingelogd;



    private static ArrayList<Personen> personenLijst = new ArrayList<>();

    public Personen(String naam, String wachtwoord, boolean ingelogd) {
        this.naam = naam;
        this.wachtwoord = wachtwoord;
        this.ingelogd = ingelogd;
    }

    public String getNaam() {
        return naam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public boolean isIngelogd() {
        return ingelogd;
    }

    public static Personen getPersonen(String naam){
        for (int i = 0; i < getPersonenLijst().size(); i++) {
            if(getPersonenLijst().get(i).getNaam().equals(naam)){
                return getPersonenLijst().get(i);
            }
        }
        return null;
    }

    public void setIngelogd(boolean ingelogd) {
        this.ingelogd = ingelogd;
    }

    public static ArrayList<Personen> getPersonenLijst() {
        return personenLijst;
    }

    public static ArrayList<Personen> personenLijst(){
        personenLijst.add(new Personen("Robin", "Test", false));
        personenLijst.add(new Personen("Marc", "hout", false));
        personenLijst.add(new Personen("Carla", "niks", false));

        return personenLijst;
    }

    public static Personen checkGegevens(String naam, String wachtwoord){
        for (int i = 0; i < personenLijst.size(); i++) {
            if(getPersonenLijst().get(i).getNaam().equals(naam)){
                if(getPersonenLijst().get(i).getWachtwoord().equals(wachtwoord)){
                    if(getPersonenLijst().get(i).isIngelogd() == false) {
                        return getPersonenLijst().get(i);
                    }
                }
            }
        }
        return null;
    }
}

