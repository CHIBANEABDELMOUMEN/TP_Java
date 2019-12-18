package UNIVTLN_TPM1DID;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class carre extends figure{
    private double cote;
    private static final AtomicInteger count = new AtomicInteger(0);
    private int  id = 0;
    private String carreID = null;

    public carre(){}

    public carre(double cote) {
        this.cote = cote;
        String name = "S";
        id = count.incrementAndGet();
        carreID = name + Integer.toString(id) ;
        id = id+1;
    }

    public double getCote() {
        return cote;
    }

    public String getcarreID() {
        return this.carreID;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double getAire() {
        return cote*cote;
    }

    @Override
    public double getCentre() {
        return super.getCentre();
    }


    @Override
    public String toString() {
        return "carre{" +
                "cote=" + cote +
                ", id=" + carreID+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == carre.class)) {
            this.carreID = ((carre) obj).carreID;
            return true;
        }
        return false;
    }
}
