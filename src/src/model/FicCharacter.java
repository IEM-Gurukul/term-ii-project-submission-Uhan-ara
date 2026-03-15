package model;

import java.util.ArrayList;

public class FicCharacter {

    private String name;
    private ArrayList<String> appearances;

    public FicCharacter(String name) {
        this.name = name;
        appearances = new ArrayList<>();
    }

    public void addAppearance(String bookTitle) {
        appearances.add(bookTitle);
    }

    public void showAppearances() {

        System.out.println("Character: " + name);

        for (String book : appearances) {
            System.out.println("- Appears in: " + book);
        }
    }

    public String getName() {
        return name;
    }
}