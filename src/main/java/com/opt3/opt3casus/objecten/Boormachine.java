package com.opt3.opt3casus.objecten;

public class Boormachine extends Producten{
    private String merk;
    private String type;
    private static final double huurprijs = 5;
    private static final double verzekering = 1;
    private boolean opVoorraad;

    public Boormachine(String merk, String type, boolean opVoorraad) {
        super(huurprijs, verzekering, opVoorraad);
        this.merk = merk;
        this.type = type;
    }

    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }

    public boolean isOpVoorraad() {
        return opVoorraad;
    }
}
