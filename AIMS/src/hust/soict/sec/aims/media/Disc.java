package hust.soict.sec.aims.media;

import hust.soict.sec.aims.exception.PlayerException;

public class Disc extends Media implements Playable{
    private int length;
    private String director;

    // Setters
    public void setLength(int length){
        this.length = length;
    }
    public void setDirector(String director){
        this.director = director;
    }
    // Getters
    public int getLength() {
        return length;
    }
    public String getDirector() {
        return director;
    }

    // Constructors
    public Disc() {
        super();
    }
    public Disc(int length) {
        this.length = length;
    }
    public Disc(String director) {
        this.director = director;
    }
    public Disc(int length, String director){
        this.length = length;
        this.director = director;
    }
    public String play() throws PlayerException {
        if (this.getLength() > 0){
            return ("Media " + getTitle() + " is playing");
        }else{
            throw new PlayerException("Error: DVD is non-positive");
        }
    }
}
