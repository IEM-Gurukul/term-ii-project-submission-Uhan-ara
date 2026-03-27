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
            System.out.println("3. Search Book");
            System.out.println("4. Exit");

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

                System.out.print("Enter book title: ");
                String title = scanner.nextLine();

                manager.searchBook(title);
            }

            else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            }

        }

        scanner.close();
    }
}
