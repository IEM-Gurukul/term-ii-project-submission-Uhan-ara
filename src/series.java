package model;

import java.util.ArrayList;

public class Series {

    private String name;
    private ArrayList<Book> books;

    public Series(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Series: " + name);

        for (Book b : books) {
            b.displayInfo();
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }
}