package gui;

import javax.swing.*;
import management.*;
import model.*;

public class MainWindow extends JFrame {

    private final LibraryManager manager;
    private JTextArea outputArea;

    public MainWindow(LibraryManager manager) {

        this.manager = manager;

        setTitle("Personal Book Universe Tracker");
        setSize(700,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel title = new JLabel("Personal Book Universe Tracker");
        title.setBounds(240,10,300,30);
        add(title);

        JButton viewBtn = new JButton("View Universes");
        viewBtn.setBounds(30,60,150,30);
        add(viewBtn);

        JButton addUniverseBtn = new JButton("Add Universe");
        addUniverseBtn.setBounds(200,60,150,30);
        add(addUniverseBtn);

        JButton addSeriesBtn = new JButton("Add Series");
        addSeriesBtn.setBounds(370,60,150,30);
        add(addSeriesBtn);

        JButton addBookBtn = new JButton("Add Book");
        addBookBtn.setBounds(540,60,120,30);
        add(addBookBtn);

        JButton searchBookBtn = new JButton("Search Book");
        searchBookBtn.setBounds(30,100,150,30);
        add(searchBookBtn);

        JButton searchCharBtn = new JButton("Search Character");
        searchCharBtn.setBounds(200,100,150,30);
        add(searchCharBtn);

        JButton connectBtn = new JButton("Connect Universes");
        connectBtn.setBounds(370,100,150,30);
        add(connectBtn);

        JButton showBooksBtn = new JButton("Show Books in Series");
        showBooksBtn.setBounds(540,100,150,30);
        add(showBooksBtn);

        JButton showCharUniBtn = new JButton("Characters in Universe");
        showCharUniBtn.setBounds(30,140,180,30);
        add(showCharUniBtn);

        JButton saveBtn = new JButton("Save Data");
        saveBtn.setBounds(230,140,150,30);
        add(saveBtn);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(410,140,150,30);
        add(exitBtn);

        outputArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(outputArea);
        scroll.setBounds(30,190,630,250);
        add(scroll);

        // -------- BUTTON ACTIONS --------

        viewBtn.addActionListener(e ->
            outputArea.setText(manager.getUniverses())
        );

        addUniverseBtn.addActionListener(e -> {

            String name = JOptionPane.showInputDialog("Universe name:");

            if(name != null && !name.isEmpty()) {

                manager.addUniverse(new Universe(name));
                outputArea.append("Universe added: " + name + "\n");

            }

        });

        addSeriesBtn.addActionListener(e -> {

            String universeName = JOptionPane.showInputDialog("Universe name:");
            String seriesName = JOptionPane.showInputDialog("Series name:");

            outputArea.setText(manager.addSeries(universeName, seriesName));

        });

        addBookBtn.addActionListener(e -> {

            try{
                String universeName = JOptionPane.showInputDialog("Universe:");
                String seriesName = JOptionPane.showInputDialog("Series:");
                String titleBook = JOptionPane.showInputDialog("Book title:");
                String author = JOptionPane.showInputDialog("Author:");
                int pages = Integer.parseInt(JOptionPane.showInputDialog("Total pages:"));

                outputArea.setText(manager.addBook(universeName, seriesName, titleBook, author, pages));
            } catch (Exception ex){
                outputArea.setText("Invalid input! Please enter correct data.");
            }
        });

        searchBookBtn.addActionListener(e -> {

            String titleBook = JOptionPane.showInputDialog("Book title:");

            outputArea.setText(manager.searchBook(titleBook));

        });

        searchCharBtn.addActionListener(e -> {

            String name = JOptionPane.showInputDialog("Character name:");

            outputArea.setText(manager.searchCharacter(name));

        });

        connectBtn.addActionListener(e -> {

            String u1 = JOptionPane.showInputDialog("First universe:");
            String u2 = JOptionPane.showInputDialog("Second universe:");

            outputArea.setText(manager.connectUniverses(u1, u2));

        });

        showBooksBtn.addActionListener(e -> {

            String uName = JOptionPane.showInputDialog("Universe:");
            String sName = JOptionPane.showInputDialog("Series:");

            outputArea.setText(manager.showBooksInSeries(uName, sName));

        });

        showCharUniBtn.addActionListener(e -> {

            String universeName = JOptionPane.showInputDialog("Universe name:");

            outputArea.setText(manager.showCharactersInUniverse(universeName));

        });

        saveBtn.addActionListener(e -> {

            manager.saveUniverses();
            outputArea.append("Data saved\n");

        });

        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }
}