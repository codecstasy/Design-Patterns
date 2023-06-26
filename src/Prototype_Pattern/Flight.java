package Prototype_Pattern;

import java.util.ArrayList;

public class Flight implements Cloneable {
    private ArrayList <String> defaultFlightList;
    public Flight() {
        this.defaultFlightList = new ArrayList <String> ();
    }

    public void loadDefaultFlightList() {
        defaultFlightList.add("Qatar Airways");
        defaultFlightList.add("Malaysian Airways");
        defaultFlightList.add("Thai Airways");
        defaultFlightList.add("Indigo Airways");
        defaultFlightList.add("British Airways");
    }
    public ArrayList <String> getDefaultFlightList() {
        return defaultFlightList;
    }

    public Object clone() throws CloneNotSupportedException {
        ArrayList<Object> temp = new ArrayList<>();
        for(Object s: this.getDefaultFlightList()) {
            temp.add(s);
        }
        return temp;
    }
}
