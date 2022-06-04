package com.opt3.opt3casus.objecten;

public class Personenauto extends Producten{
    private String merk;
    private static Integer gewicht;
    private static final double huurprijs = 50.0;
    private static double verzekering;
    private boolean opVoorraad;

    public Personenauto(String merk, Integer gewicht, boolean opVoorraad) {
        super(huurprijs, gewicht * 0.01, opVoorraad);
        this.merk = merk;
        this.gewicht = gewicht;
    }

    public Double getHuurprijs() {
        return huurprijs;
    }

    public Double getVerzekering() {
        return verzekering;
    }

    public String getMerk() {
        return merk;
    }

    public static Integer getGewicht() {
        return gewicht;
    }

    public boolean isOpVoorraad() {
        return opVoorraad;
    }
}
