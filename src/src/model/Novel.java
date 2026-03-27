package model;

public class Novel extends Book {

    private String genre;

    public Novel(String title, String author, int totalPages, String genre) {
        super(title, author, totalPages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre: " + genre);
    }
}