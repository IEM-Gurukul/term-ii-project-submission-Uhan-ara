package main;

import management.*;
import gui.*;

public class Main {

    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();

        DataInitializer.loadDefaultData(manager);

        // Launch GUI
        new MainWindow(manager);

    }
}