package model;

import java.util.Collection;
import java.util.HashMap;

public class Series {

    private String name;
    private HashMap<String, Book> books = new HashMap<>();

    public Series(String name) {
        this.name = name;
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public Collection<Book> getBooks() {
        return books.values();
    }

    public void showBooks() {
        System.out.println("Series: " + name);

        for (Book book : books.values()) {
            book.displayInfo();
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }
}