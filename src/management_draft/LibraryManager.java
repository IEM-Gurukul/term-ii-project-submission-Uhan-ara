package management;

import model.*;
import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<Universe> universes;

    public LibraryManager() {
        universes = new ArrayList<>();
    }

    public void addUniverse(Universe universe) {
        universes.add(universe);
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
}
