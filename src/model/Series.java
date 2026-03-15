package model;

import java.util.Hashmap;

public class Series {

    private String name;
    private Hashmap<String, Book> books;

    public Series(String name) {
        this.name = name;
        books = new Hashmap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public void showBooks() {
        System.out.println("Series: " + name);

        for (Book book : books.values) {
            book.displayInfo();
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Book> getBooks() {
        return books;
    }
}
