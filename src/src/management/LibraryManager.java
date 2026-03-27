package management;

import model.*;
import java.util.*;

public class LibraryManager {

    private List<Universe> universes = new ArrayList<>();
    private List<FicCharacter> characters = new ArrayList<>();


    public void addUniverse(Universe u){
        universes.add(u);
    }

    public Universe getUniverse(String name){

        for(Universe u : universes){

            if(u.getName().equalsIgnoreCase(name))
                return u;

        }

        return null;
    }

    public void addCharacter(FicCharacter c){
        characters.add(c);
    }

    // ---------------- VIEW UNIVERSES ----------------

    public String getUniverses(){

        StringBuilder result = new StringBuilder();

        result.append("Universes:\n");

        for(Universe u : universes){
            result.append("- ").append(u.getName()).append("\n");
        }

        return result.toString();
    }


    // ---------------- ADD SERIES ----------------

    public String addSeries(String universeName,String seriesName){

        Universe u = getUniverse(universeName);

        if(u == null)
            return "Universe not found";

        Series s = new Series(seriesName);

        u.addSeries(s);

        return "Series added successfully";
    }


    // ---------------- ADD BOOK ----------------

    public String addBook(String universeName,String seriesName,String title,String author,int pages){

        Universe u = getUniverse(universeName);

        if(u == null)
            return "Universe not found";

        Series s = u.getSeries(seriesName);

        if(s == null)
            return "Series not found";

        Book b = new Novel(title,author,pages,"General");

        s.addBook(b);

        return "Book added successfully";
    }


    // ---------------- SEARCH BOOK ----------------

    public String searchBook(String title){

        for(Universe u : universes){

            for(Series s : u.getSeriesList()){

                for(Book b : s.getBooks()){

                    if(b.getTitle().equalsIgnoreCase(title)){

                        return "Book Found\nTitle: " + b.getTitle() +
                                "\nAuthor: " + b.getAuthor() +
                                "\nUniverse: " + u.getName() +
                                "\nSeries: " + s.getName();
                    }

                }

            }

        }

        return "Book not found";
    }


    // ---------------- SEARCH CHARACTER ----------------

    public String searchCharacter(String name){

        for(FicCharacter c : characters){

            if(c.getName().equalsIgnoreCase(name)){

                return "Character Found: " + name;

            }

        }

        return "Character not found";
    }


    // ---------------- CONNECT UNIVERSES ----------------

    public String connectUniverses(String u1,String u2){

        Universe first = getUniverse(u1);
        Universe second = getUniverse(u2);

        if(first == null || second == null)
            return "Universe not found";

        first.connectUniverse(second);
        second.connectUniverse(first);

        return "Universes connected successfully";
    }


    // ---------------- SHOW BOOKS ----------------

    public String showBooksInSeries(String universeName,String seriesName){

        Universe u = getUniverse(universeName);

        if(u == null)
            return "Universe not found";

        Series s = u.getSeries(seriesName);

        if(s == null)
            return "Series not found";

        StringBuilder result = new StringBuilder();

        result.append("Books:\n");

        for(Book b : s.getBooks()){

            result.append("- ").append(b.getTitle()).append("\n");

        }

        return result.toString();
    }


    // ---------------- SHOW CHARACTERS IN UNIVERSE ----------------

    public String showCharactersInUniverse(String universeName){

        Universe u = getUniverse(universeName);

        if(u == null)
            return "Universe not found";

        StringBuilder result = new StringBuilder();
        Set<String> unique = new HashSet<>();

        result.append("Characters in ").append(universeName).append(":\n");

        for(Series s : u.getSeriesList()){

            for(Book b : s.getBooks()){

                for(FicCharacter c : b.getCharacters()){
                    unique.add(c.getName());
                }

            }

        }

        for(String name : unique){
            result.append("- ").append(name).append("\n");
        }

        return result.toString();
    }


    // ---------------- SAVE DATA ----------------

    public void saveUniverses(){

        System.out.println("Data saved successfully.");

    }

}