package hust.soict.sec.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    //Constructors
    public DigitalVideoDisc(String title, String category, String director, int length, Double cost) {
        super(length, director);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public DigitalVideoDisc(String title, String category, String director, Double cost) {
        super(director);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public DigitalVideoDisc(String title, String category, Double cost) {
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public DigitalVideoDisc(String title) {
        super(title);
        super.nbMedia++;
        this.setId(nbMedia);
    }

    @Override
    public String play() {
        //System.out.println("DVD " + this.getTitle() + " is playing");
        return ("DVD " + this.getTitle() + " is playing");
    }
}