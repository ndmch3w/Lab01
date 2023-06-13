package hust.soict.sec.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    //Constructors
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(length, director);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public DigitalVideoDisc(String title, String category, String director, double cost) {
        super(director);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public DigitalVideoDisc(String title, String category, double cost) {
        super(title);
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
    public void play() {
        System.out.println("DVD " + this.getTitle() + " is playing");
    }
}