package hust.soict.sec.aims.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Media {
    private int id;
    private String title;
    private String category;
    private double cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public static int nbMedia = 0;



    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public void setTitle(String title){
        this.title = title;
    }

    // Getters
    public String getCategory() {
        return category;
    }
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public double getCost() {
        return cost;
    }

    // Constructor
    public Media() {
        nbMedia++;
        this.setId(nbMedia);
    }
    public Media(String title){
        this.title = title;
        nbMedia++;
        this.setId(nbMedia);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Media sampleMedia = (Media) obj;
        if (title.equals(sampleMedia.getTitle())){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return ("Id: " + id + ", Category: " + category + ", Title: " + title + ", cost: " + cost);
    }

    public static void main(String[] args){
        ArrayList<Media> mediae = new ArrayList<Media>();

        Media dvd = new DigitalVideoDisc("Tarzan", "Action", 888.0);
        Media book = new Book("Orange", "Comedy", 777.0);

        mediae.add(dvd);
        mediae.add(book);

        // Sort by title-cost
        Collections.sort(mediae, Media.COMPARE_BY_TITLE_COST);
        System.out.println("Sort by title-cost:");
        for (Media m : mediae){
            System.out.println(m);
        }

        // Sort by cost-title
        Collections.sort(mediae, Media.COMPARE_BY_COST_TITLE);
        System.out.println("Sort by cost-title:");
        for (Media m : mediae){
            System.out.println(m.toString());
        }
    }
}
