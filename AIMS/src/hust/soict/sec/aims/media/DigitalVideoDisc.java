package hust.soict.sec.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
    //Constructors
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(length, director);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }
    public DigitalVideoDisc(String title, String category, String director, double cost) {
        super(director);
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }
    public DigitalVideoDisc(String title, String category, double cost) {
        super();
        this.setTitle(title);
        this.setCategory(category);
        this.setCost(cost);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }
    public DigitalVideoDisc(String title) {
        super();
        this.setTitle(title);
        nbDigitalVideoDisc++;
        this.setId(nbDigitalVideoDisc);
    }

    // Attributes
    public static int nbDigitalVideoDisc = 0;

    public boolean equals(DigitalVideoDisc disc) {
        if (this.getTitle().equals(disc.getTitle()) && this.getCategory().equals(disc.getCategory()) &&
                this.getDirector().equals(disc.getDirector()) && this.getLength() == disc.getLength() && this.getCost() ==
                disc.getCost()) {
            return true;
        }
        return false;
    }

    @Override
    public void play() {
        System.out.println("DVD " + this.getTitle() + " is playing");
    }
}