package hust.soict.sec.aims.store;

import hust.soict.sec.aims.media.DigitalVideoDisc;
import hust.soict.sec.aims.media.Media;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public String getItemsInStore(){
        return itemsInStore.toString();
    }
    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore.add(dvd);
    }
    public void removeDVD(DigitalVideoDisc dvd){
        itemsInStore.remove(dvd);
    }
}
