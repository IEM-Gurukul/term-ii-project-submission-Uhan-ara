package main;

import java.util.Scanner;
import model.*;
import management.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();

        while (true) {

            System.out.println("\n--- Personal Book Universe Tracker ---");
            System.out.println("1. Add Universe");
            System.out.println("2. View Universes");
            System.out.println("3. Add Series");
            System.out.println("4. Add Book");
            System.out.println("5. Search Book");
            System.out.println("6. Connect Universes");
            System.out.println("7. Save Data");
            System.out.println("8. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter universe name: ");
                String name = scanner.nextLine();

                Universe universe = new Universe(name);
                manager.addUniverse(universe);

                System.out.println("Universe added!");

            }

            else if (choice == 2) {
                manager.showUniverses();
            }

            else if (choice == 3) {

                System.out.print("Enter universe name: ");
                String universeName = scanner.nextLine();

                System.out.print("Enter series name: ");
                String seriesName = scanner.nextLine();

                Universe u = manager.getUniverse(universeName);

                if (u != null) {
                    Series s = new Series(seriesName);
                    u.addSeries(s);
                    System.out.println("Series added!");
                } else {
                    System.out.println("Universe not found.");
                }
            }

            else if (choice == 4) {

                System.out.print("Universe: ");
                String universeName = scanner.nextLine();

                System.out.print("Series: ");
                String seriesName = scanner.nextLine();

                Universe u = manager.getUniverse(universeName);

                if (u != null) {

                    Series s = u.getSeries(seriesName);

                    if (s != null) {

                        System.out.print("Book title: ");
                        String title = scanner.nextLine();

                        System.out.print("Author: ");
                        String author = scanner.nextLine();

                        System.out.print("Total pages: ");
                        int pages = scanner.nextInt();
                        scanner.nextLine();

                        Book book = new Novel(title, author, pages, "General");
                        s.addBook(book);

                        System.out.println("Book added!");

                    } else {
                        System.out.println("Series not found.");
                    }

                } else {
                    System.out.println("Universe not found.");
                }
            }

            else if (choice == 5) {

                System.out.print("Enter book title: ");
                String title = scanner.nextLine();

                manager.searchBook(title);
            }

            else if(choice == 6){

                System.out.print("First universe: ");
                String u1 = scanner.nextLine();

                System.out.print("Second universe: ");
                String u2 = scanner.nextLine();

                Universe first = manager.getUniverse(u1);
                Universe second = manager.getUniverse(u2);

                if(first != null && second != null){
                    first.connectUniverse(second);
                    second.connectUniverse(first);
                    System.out.println("Universes connected!");
                }
            }

            else if (choice == 8) {
                System.out.println("Goodbye!");
                break;
            }

        }

        scanner.close();


        // 1️⃣ Create Universes
        Universe hpUniverse = new Universe("Harry Potter Universe");
        Universe fbUniverse = new Universe("Fantastic Beasts Universe");

        // Connect universes (entangled universes)
        hpUniverse.connectUniverse(fbUniverse);
        fbUniverse.connectUniverse(hpUniverse);

        hpUniverse.showConnectedUniverses();


        // 2️⃣ Create Series
        Series hpSeries = new Series("Harry Potter Series");
        Series fbSeries = new Series("Fantastic Beasts Series");

        hpUniverse.addSeries(hpSeries);
        fbUniverse.addSeries(fbSeries);


        // 3️⃣ Create Books
        Book hp1 = new Novel("Philosopher's Stone", "J.K. Rowling", 350, "Fantasy");
        Book hp2 = new Novel("Chamber of Secrets", "J.K. Rowling", 340, "Fantasy");

        hpSeries.addBook(hp1);
        hpSeries.addBook(hp2);


        // 4️⃣ Update Reading Progress
        hp1.updateProgress(120);


        // 5️⃣ Add Characters
        FicCharacter harry = new FicCharacter("Harry Potter");
        FicCharacter hermione = new FicCharacter("Hermione Granger");

        hp1.addCharacter(harry);
        hp1.addCharacter(hermione);


        // 6️⃣ Display Book Information
        hp1.displayInfo();


        // 7️⃣ Display Characters in Book
        hp1.showCharacters();


        // 8️⃣ Display Series in Universe
        hpUniverse.displaySeries();


        // 9️⃣ Show Character Appearances
        harry.addAppearance("Philosopher's Stone");
        harry.addAppearance("Chamber of Secrets");

        harry.showAppearances();
    }
}