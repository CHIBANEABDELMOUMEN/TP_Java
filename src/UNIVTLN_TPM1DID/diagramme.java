package UNIVTLN_TPM1DID;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class diagramme extends figure {
    private ArrayList<figure> figures = new ArrayList();
    private static final AtomicInteger count = new AtomicInteger(0);
    private int  id = 0;
    double Aire = 0;

    public diagramme(){
        id = count.incrementAndGet();
        id = id+1;
    }

    public double getCenter(){
        return 0;
    }

    public double getAire(){
        for(figure f : figures) {
            Aire = Aire + f.getAire();
        }
        return Aire;
    }

    public double getBoundingBox(){
        return 0;
    }
}
