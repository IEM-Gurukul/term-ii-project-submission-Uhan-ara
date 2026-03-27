
package model;

import java.util.Collection;
import java.util.HashMap;

public class Universe {

    private String name;
    private HashMap<String, Series> seriesList = new HashMap<>();
    private HashMap<String, Universe> connectedUniverses;

    public Universe(String name) {
        this.name = name;
        seriesList = new HashMap<>();
        connectedUniverses = new HashMap<>();
    }

    public void addSeries(Series series) {
        seriesList.put(series.getName(), series);
    }

    //entangled universes-----------------------------------------
    public void connectUniverse(Universe universe) {
        connectedUniverses.put(universe.getName(), universe);
    }

    public void showConnectedUniverses() {

        if (connectedUniverses.isEmpty()) {
            System.out.println("No connected universes.");
            return;
        }

        System.out.println("Connected Universes:");
        for (Universe u : connectedUniverses.values()) {
            System.out.println("- " + u.getName());
        }
    }
    //---------------------------------------------------------------

    public void displaySeries() {
        System.out.println("Universe: " + name);

        for (Series s : seriesList.values()) {
            System.out.println("- " + s.getName());
        }
    }
    
    public String getName() {
        return name;
    }

    public Series getSeries(String name) {
        return seriesList.get(name);   // ✅ BEST & SIMPLE
    }

    public Collection<Series> getSeriesList() {
        return seriesList.values();
    }
}
