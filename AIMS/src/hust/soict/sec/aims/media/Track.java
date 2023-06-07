package hust.soict.sec.aims.media;

public class Track {
    private String title;
    private int length;

    // Getters
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }

    public Track(){}
    public Track(String title) {
        this.title = title;
    }
    public Track(int length) {
        this.length = length;
    }
    public Track(String title, int length){
        this(title);
        this.length = length;
    }
}
