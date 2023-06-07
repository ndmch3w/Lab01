package hust.soict.sec.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist(){
        return artist;
    }

    // Constructors
    public CompactDisc(){
        super();
    }
    public CompactDisc(int length, String director, String artist, ArrayList<Track> tracks) {
        super(length, director);
        this.artist = artist;
        this.tracks = tracks;
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
}
