package management;

import model.*;

public class DataInitializer {

    public static void loadDefaultData(LibraryManager manager) {

        // ---------------- Harry Potter Universe ----------------
        Universe hpUniverse = new Universe("Harry Potter");

        Series hpSeries = new Series("Harry Potter Series");

        Book hp1 = new Novel("Philosopher's Stone", "J.K. Rowling", 350, "Fantasy");
        Book hp2 = new Novel("Chamber of Secrets", "J.K. Rowling", 340, "Fantasy");
        Book hp3 = new Novel("Prisoner of Azkaban", "J.K. Rowling", 430, "Fantasy");

        hpSeries.addBook(hp1);
        hpSeries.addBook(hp2);
        hpSeries.addBook(hp3);

        hpUniverse.addSeries(hpSeries);

        manager.addUniverse(hpUniverse);


        // ---------------- Fantastic Beasts Universe ----------------
        Universe fbUniverse = new Universe("Fantastic Beasts");

        Series fbSeries = new Series("Fantastic Beasts Series");

        Book fb1 = new Novel("Fantastic Beasts and Where to Find Them", "J.K. Rowling", 290, "Fantasy");

        fbSeries.addBook(fb1);

        fbUniverse.addSeries(fbSeries);

        manager.addUniverse(fbUniverse);


        // ---------------- Avengers Universe ----------------
        Universe avengersUniverse = new Universe("Avengers");

        Series avengersSeries = new Series("Avengers Series");

        Book av1 = new Novel("Avengers Assemble", "Marvel", 300, "Superhero");

        avengersSeries.addBook(av1);

        avengersUniverse.addSeries(avengersSeries);

        manager.addUniverse(avengersUniverse);


        // ---------------- X-Men Universe ----------------
        Universe xmenUniverse = new Universe("X-Men");

        Series xmenSeries = new Series("X-Men Series");

        Book xm1 = new Novel("Days of Future Past", "Marvel", 280, "Superhero");

        xmenSeries.addBook(xm1);

        xmenUniverse.addSeries(xmenSeries);

        manager.addUniverse(xmenUniverse);


        // ---------------- LOTR Universe ----------------
        Universe lotrUniverse = new Universe("Lord of the Rings");

        Series lotrSeries = new Series("LOTR Series");

        Book lotr1 = new Novel("The Fellowship of the Ring", "J.R.R. Tolkien", 423, "Fantasy");

        lotrSeries.addBook(lotr1);

        lotrUniverse.addSeries(lotrSeries);

        manager.addUniverse(lotrUniverse);


        // ---------------- Hobbit Universe ----------------
        Universe hobbitUniverse = new Universe("The Hobbit");

        Series hobbitSeries = new Series("Hobbit Series");

        Book hobbit1 = new Novel("The Hobbit", "J.R.R. Tolkien", 310, "Fantasy");

        hobbitSeries.addBook(hobbit1);

        hobbitUniverse.addSeries(hobbitSeries);

        manager.addUniverse(hobbitUniverse);


        // ---------------- Connect Universes (Multiverse) ----------------
        hpUniverse.connectUniverse(fbUniverse);
        fbUniverse.connectUniverse(hpUniverse);

        avengersUniverse.connectUniverse(xmenUniverse);
        xmenUniverse.connectUniverse(avengersUniverse);

        lotrUniverse.connectUniverse(hobbitUniverse);
        hobbitUniverse.connectUniverse(lotrUniverse);


        // ---------------- Characters ----------------

        //HP_&_FB//
        FicCharacter harry = new FicCharacter("Harry Potter");
        FicCharacter hermione = new FicCharacter("Hermione Granger");
        FicCharacter newt = new FicCharacter("Newt Scamander");
        FicCharacter dumbledore = new FicCharacter("Albus Dumbledore");
        FicCharacter ron = new FicCharacter("Ron Weasley");
        FicCharacter snape = new FicCharacter("Severus Snape");
        FicCharacter voldemort = new FicCharacter("Lord Voldemort");
        FicCharacter hagrid = new FicCharacter("Rubeus Hagrid");

        hp1.addCharacter(harry);
        hp1.addCharacter(hermione);
        hp1.addCharacter(ron);
        hp1.addCharacter(dumbledore);
        hp1.addCharacter(hagrid);
        hp1.addCharacter(snape);
        hp1.addCharacter(voldemort);

        hp2.addCharacter(harry);
        hp2.addCharacter(hermione);
        hp2.addCharacter(ron);
        hp2.addCharacter(dumbledore);
        hp2.addCharacter(snape);

        hp3.addCharacter(harry);
        hp3.addCharacter(hermione);
        hp3.addCharacter(ron);

        fb1.addCharacter(newt);
        fb1.addCharacter(dumbledore);

        harry.addAppearance("Harry Potter", "Harry Potter Series", "Philosopher's Stone");
        harry.addAppearance("Harry Potter", "Harry Potter Series", "Chamber of Secrets");
        harry.addAppearance("Harry Potter", "Harry Potter Series", "Prisoner of Azkaban");

        hermione.addAppearance("Harry Potter", "Harry Potter Series", "Philosopher's Stone");
        hermione.addAppearance("Harry Potter", "Harry Potter Series", "Chamber of Secrets");
        hermione.addAppearance("Harry Potter", "Harry Potter Series", "Prisoner of Azkaban");

        ron.addAppearance("Harry Potter", "Harry Potter Series", "Philosopher's Stone");
        ron.addAppearance("Harry Potter", "Harry Potter Series", "Chamber of Secrets");
        ron.addAppearance("Harry Potter", "Harry Potter Series", "Prisoner of Azkaban");

        newt.addAppearance("Fantastic Beasts", "Fantastic Beasts Series", "Fantastic Beasts and Where to Find Them");

        dumbledore.addAppearance("Harry Potter", "Harry Potter Series", "Philosopher's Stone");
        dumbledore.addAppearance("Harry Potter", "Harry Potter Series", "Chamber of Secrets");
        dumbledore.addAppearance("Fantastic Beasts", "Fantastic Beasts Series", "Fantastic Beasts and Where to Find Them");

        snape.addAppearance("Harry Potter", "Harry Potter Series", "Philosopher's Stone");
        snape.addAppearance("Harry Potter", "Harry Potter Series", "Chamber of Secrets");

        voldemort.addAppearance("Harry Potter", "Harry Potter Series", "Philosopher's Stone");

        manager.addCharacter(harry);
        manager.addCharacter(hermione);
        manager.addCharacter(newt);
        manager.addCharacter(dumbledore);
        manager.addCharacter(ron);
        manager.addCharacter(snape);
        manager.addCharacter(voldemort);
        manager.addCharacter(hagrid);


        //LOTR_&_Hobbit//
        FicCharacter frodo = new FicCharacter("Frodo Baggins");
        FicCharacter gandalf = new FicCharacter("Gandalf");
        FicCharacter aragorn = new FicCharacter("Aragorn");
        FicCharacter legolas = new FicCharacter("Legolas");

        lotr1.addCharacter(frodo);
        lotr1.addCharacter(gandalf);
        lotr1.addCharacter(aragorn);
        lotr1.addCharacter(legolas);
        hobbit1.addCharacter(gandalf);

        frodo.addAppearance("Lord of the Rings", "LOTR Series", "The Fellowship of the Ring");

        gandalf.addAppearance("Lord of the Rings", "LOTR Series", "The Fellowship of the Ring");
        gandalf.addAppearance("The Hobbit", "Hobbit Series", "The Hobbit");

        aragorn.addAppearance("Lord of the Rings", "LOTR Series", "The Fellowship of the Ring");

        legolas.addAppearance("Lord of the Rings", "LOTR Series", "The Fellowship of the Ring");

        manager.addCharacter(frodo);
        manager.addCharacter(gandalf);
        manager.addCharacter(aragorn);
        manager.addCharacter(legolas);


        //MARVEL//
        FicCharacter ironman = new FicCharacter("Tony Stark");
        FicCharacter spiderman = new FicCharacter("Peter Parker");
        FicCharacter thor = new FicCharacter("Thor");
        FicCharacter hulk = new FicCharacter("Bruce Banner");

        av1.addCharacter(ironman);
        av1.addCharacter(thor);
        av1.addCharacter(spiderman);
        av1.addCharacter(hulk);

        ironman.addAppearance("Avengers", "Avengers Series", "Avengers Assemble");

        thor.addAppearance("Avengers", "Avengers Series", "Avengers Assemble");

        spiderman.addAppearance("Avengers", "Avengers Series", "Avengers Assemble");

        hulk.addAppearance("Avengers", "Avengers Series", "Avengers Assemble");

        manager.addCharacter(ironman);
        manager.addCharacter(thor);
        manager.addCharacter(spiderman);
        manager.addCharacter(hulk);


        //X-MEN//
        FicCharacter wolverine = new FicCharacter("Wolverine");
        xm1.addCharacter(wolverine);

        wolverine.addAppearance("X-Men", "X-Men Series", "Days of Future Past");

        manager.addCharacter(wolverine);
    }
}