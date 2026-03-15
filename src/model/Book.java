package model;
import java.util.ArrayList;

public abstract class Book {

    private String title;
    private String author;
    private int totalPages;
    private int pagesRead;
    private String status; // Planned, Reading, Completed
    private ArrayList<Character> characters;

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.pagesRead = 0;
        this.status = "Planned";
        this.characters = new ArrayList<>();
    }

    public void updateProgress(int pages) {
        
        if (pages < 0 || pages > totalPages) {
            System.out.println("Invalid page number.");
            return;
        }
        
        pagesRead = pages;

        if (pagesRead >= totalPages) {
            status = "Completed";
        } else if (pagesRead > 0) {
            status = "Reading";
        }
    }

    //multiverse characters-------------------------------------------------------
    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void showCharacters() {

        if (characters.isEmpty()) {
            System.out.println("No characters listed.");
            return;
        }

        System.out.println("Characters:");

        for (Character c : characters) {
            System.out.println("- " + c.getName());
        }
    }

    public void displayInfo() {

        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Progress: " + pagesRead + "/" + totalPages);
        System.out.println("Status: " + status);

        showCharacters();
    }
    //---------------------------------------------------------------------------------

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesRead() {
        return pagesRead;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public String getStatus() {
        return status;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Progress: " + pagesRead + "/" + totalPages);
        System.out.println("Status: " + status);
    }
}
