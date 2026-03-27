package model;

public class Comic extends Book {

    private String illustrator;

    public Comic(String title, String author, int pages, String illustrator){
        super(title, author, pages);
        this.illustrator = illustrator;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Illustrator: " + illustrator);
    }
}