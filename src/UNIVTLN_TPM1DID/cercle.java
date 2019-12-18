package UNIVTLN_TPM1DID;

import java.util.concurrent.atomic.AtomicInteger;

public class cercle extends figure {
    private double origin;
    private double rayon;
    private final static double pi =  3.14;
    private static final AtomicInteger count = new AtomicInteger(0);
    private int  id = 0;
    private String disqueID = null;

    public cercle(double rayon) {
        this.rayon = rayon;
        String name = "C";
        id = count.incrementAndGet();
        disqueID = name + Integer.toString(id) ;
        id = id+1;
    }

    public double getOrigin() {
        return origin;
    }

    public void setOrigin(double origin) {
        this.origin = origin;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public String getDisqueID() {
        return this.disqueID;
    }

    @Override
    public double getAire() {
        return rayon*rayon*pi;
    }

    @Override
    public double getCentre() {
        return super.getCentre();
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == cercle.class)) {
            this.disqueID = ((cercle) obj).disqueID;
            return true;
        }
        return false;
    }
}
