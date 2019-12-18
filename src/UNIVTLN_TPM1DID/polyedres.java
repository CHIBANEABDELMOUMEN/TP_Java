package UNIVTLN_TPM1DID;

import UNIVTLN_TPM1DID.figure;

import java.util.concurrent.atomic.AtomicInteger;

public class polyedres extends figure {
    private double x,y,h;
    private static final AtomicInteger count = new AtomicInteger(0);
    private int  id = 0;
    private String polyedresID = null;

    public polyedres(double x, double y, double h) {
        this.x = x;
        this.y = y;
        this.h = h;
        String name = "P";
        id = count.incrementAndGet();
        polyedresID = name + Integer.toString(id) ;
        id = id+1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getAire() {
        return x*y*h;
    }

    @Override
    public double getCentre() {
        return super.getCentre();
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == polyedres.class)) {
            this.polyedresID = ((polyedres) obj).polyedresID;
            return true;
        }
        return false;
    }
}
