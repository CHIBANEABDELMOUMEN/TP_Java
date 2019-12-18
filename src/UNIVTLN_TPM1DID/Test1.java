package UNIVTLN_TPM1DID;

import java.util.Map;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args){
        carre c1 = new carre(5);
        carre c2 = new carre(6);
        cercle d1 = new cercle(4.5);
        rectangle r1 = new rectangle(10,20);
        figure f = new  figure();
        //System.out.println(c2.toString());
        Map<String,Double> map = new TreeMap<String,Double>();
        map.put(c1.getcarreID(), c1.getAire());
        map.put(c2.getcarreID(), c2.getAire());
        map.put(d1.getDisqueID(), d1.getAire());
        map.put(r1.getRectID(),r1.getAire());
        //Map<String,Double> map1 = (Map<String, Double>) f.entriesSortedByValues(map);
        System.out.println(f.entriesSortedByValues(map));


    }
}
