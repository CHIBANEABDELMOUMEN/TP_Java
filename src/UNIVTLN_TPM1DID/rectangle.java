package UNIVTLN_TPM1DID;

import java.util.concurrent.atomic.AtomicInteger;

public class rectangle extends figure  {
    private double longuer, largeur;
    private static final AtomicInteger count = new AtomicInteger(0);
    private int  id = 0;
    private String rectID = null;

    public rectangle(double longuer, double largeur) {
        this.longuer = longuer;
        this.largeur = largeur;
        String name = "R";
        id = count.incrementAndGet();
        rectID = name + Integer.toString(id) ;
        id = id+1;
    }

    public String getRectID() {
        return rectID;
    }

    public void setRectID(String rectID) {
        this.rectID = rectID;
    }

    public double getLonguer() {
        return longuer;
    }

    public void setLonguer(double longuer) {
        this.longuer = longuer;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    @Override
    public double getAire() {
        return longuer*largeur;
    }

    @Override
    public double getCentre() {
        return super.getCentre();
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == rectangle.class)) {
            this.rectID = ((rectangle) obj).rectID;
            return true;
        }
        return false;
    }
}
