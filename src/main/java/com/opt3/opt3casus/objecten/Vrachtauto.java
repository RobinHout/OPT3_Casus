package com.opt3.opt3casus.objecten;

public class Vrachtauto extends Producten{

    private static Integer laadvermogen;
    private static Integer gewicht;
    private static double huurprijs;
    private static double verzekering;
    private boolean opVoorraad;

    public Vrachtauto(Integer laadvermogen, Integer gewicht, boolean opVoorraad) {
        super(laadvermogen * 0.1, gewicht * 0.01, opVoorraad);
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
    }

    //public static Producten getProduct(){
   //    return getClass().getName();
    //}

    public static Integer getLaadvermogen() {
        return laadvermogen;
    }

    public static Integer getGewicht() {
        return gewicht;
    }

    public static double getHuurprijs() {
        return huurprijs;
    }

    public static double getVerzekering() {
        return verzekering;
    }

    public boolean isOpVoorraad() {
        return opVoorraad;
    }
}
