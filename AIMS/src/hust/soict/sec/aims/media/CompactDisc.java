package hust.soict.sec.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist(){
        return artist;
    }

    // Constructors
    public CompactDisc(){
        super();
        super.nbMedia++;
        this.setId(nbMedia);
    }
    public CompactDisc(String title, int length, String director, String artist, ArrayList<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
        nbMedia++;
        this.setId(nbMedia);
    }
    public CompactDisc(String title, String category, String director, int length, Double cost){
        this.setTitle(title);
        this.setCategory(category);
        this.setDirector(director);
        this.setLength(length);
        this.setCost(cost);
        super.nbMedia++;
        this.setId(nbMedia);
    }

    public void addTrack(Track newTrack){
        if (tracks.contains(newTrack)){
            System.out.println("Track already existed");
        }else{
            tracks.add(newTrack);
        }
    }
    public void removeTrack(Track chosenToBeRemove){
        if (tracks.contains(chosenToBeRemove)){
            tracks.remove(chosenToBeRemove);
        }else{
            System.out.println("Input track not in tracks list");
        }
    }
    @Override
    public int getLength(){
        int res = 0;
        for (Track track : tracks){
            res += track.getLength();
        }
        return res;
    }

    @Override
    public String play() {
        System.out.println("Compact disc information:");
        System.out.println("Title: " + this.getTitle() + ", Artist:" + artist);
        StringBuilder res = new StringBuilder();
        for (Track track : tracks){
            res.append(track.play() + "\n");
        }
        return res.toString();
    }
}
