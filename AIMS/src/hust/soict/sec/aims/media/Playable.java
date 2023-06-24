package hust.soict.sec.aims.media;

import hust.soict.sec.aims.exception.PlayerException;

public interface Playable {
    public abstract String play() throws PlayerException;
}
