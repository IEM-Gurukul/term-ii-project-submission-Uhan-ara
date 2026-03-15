package management;

import model.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;


public class LibraryManager {

    private ArrayList<Universe> universes;

    public LibraryManager() {
        universes = new ArrayList<>();
    }

    public void addUniverse(Universe universe) {
        universes.add(universe);
    }

    public Universe getUniverse(String name) {

        for (Universe u : universes) {
            if (u.getName().equalsIgnoreCase(name)) {
                return u;
            }
        }

        return null;
    }

    public void showUniverses() {
        for (Universe u : universes) {
            System.out.println(u.getName());
        }
    }

    public void searchBook(String title) {

        for (Universe u : universes) {
            for (Series s : u.getSeriesList().values()) {
                for (Book b : s.getBooks().values()) {

                    if (b.getTitle().equalsIgnoreCase(title)) {
                        System.out.println("Book found:");
                        b.displayInfo();
                        return;
                    }

                }
            }
        }

        System.out.println("Book not found.");
    }
    public void saveUniverses() {

        try {
            FileWriter writer = new FileWriter("universes.txt");

            for (Universe u : universes) {
                writer.write(u.getName() + "\n");
            }

            writer.close();
            System.out.println("Data saved.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}