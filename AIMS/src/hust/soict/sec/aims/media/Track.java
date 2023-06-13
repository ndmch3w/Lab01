package hust.soict.sec.aims.media;

public class Track implements Playable{
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

    @Override
    public void play() {
        System.out.println("Track " + title + " is playing");
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track sampleTrack = (Track) obj;
        if (title.equals(sampleTrack.getTitle()) && length == sampleTrack.getLength()){
            return true;
        }
        return false;
    }

}
