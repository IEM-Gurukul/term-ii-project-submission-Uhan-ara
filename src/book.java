package model;

public abstract class Book {

    private String title;
    private String author;
    private int totalPages;
    private int pagesRead;
    private String status; // Planned, Reading, Completed

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.pagesRead = 0;
        this.status = "Planned";
    }

    public void updateProgress(int pages) {
        pagesRead = pages;

        if (pagesRead >= totalPages) {
            status = "Completed";
        } else if (pagesRead > 0) {
            status = "Reading";
        }
    }

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