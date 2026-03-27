package model;

import java.util.ArrayList;

public class FicCharacter {

    private String name;
    private ArrayList<String> appearances;

    public FicCharacter(String name) {
        this.name = name;
        appearances = new ArrayList<>();
    }

    public void addAppearance(String universe, String series, String book) {

        String appearance = "Universe: " + universe +
                            " | Series: " + series +
                            " | Book: " + book;

        appearances.add(appearance);
    }

    public void showAppearances() {

        System.out.println("Character: " + name);

        if (appearances.isEmpty()) {
            System.out.println("No appearances recorded.");
            return;
        }

        for (String app : appearances) {
            System.out.println("- " + app);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFromUniverse(String universeName) {

        for(String appearance : appearances){

            if(appearance.toLowerCase().contains(universeName.toLowerCase())){
                return true;
            }

        }

        return false;
    }
}