package hust.soict.sec.aims.media;

import hust.soict.sec.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    // Constructors
    public Book(String title){
        super(title);
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public Book(String title, String category, Double cost){
        this(title);
        this.setCategory(category);
        this.setCost(cost);
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public Book(String title, String category, Double cost, List<String> authors){
        this(title, category, cost);
        this.authors = authors;
        super.nbMedia++;
        this.setId(nbMedia);
    }

    // Getters
    public List<String> getAuthors() {
        return authors;
    }

    // Setters
    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName){
        if (authors.contains(authorName)) {
            System.out.println("Author already in authors list");
        } else {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName){
        if (authors.remove(authorName)) {
            System.out.println("Author removed successfully.");
        } else {
            System.out.println("Author not found in authors list.");
        }
    }
}
