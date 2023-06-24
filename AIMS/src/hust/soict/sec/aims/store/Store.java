package hust.soict.sec.aims.store;

import hust.soict.sec.aims.media.DigitalVideoDisc;
import hust.soict.sec.aims.media.Media;

import java.lang.module.ModuleDescriptor;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public String printItemsInStore(){
        return itemsInStore.toString();
    }

    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void addMedia(Media m){
        itemsInStore.add(m);
        System.out.println("Add successfully");
    }
    public void removeMedia(Media m){
        itemsInStore.remove(m);
    }
    public boolean isInStore(String inputTitle){
        for (Media m : itemsInStore){
            System.out.println(m.getTitle());
        }
        for (Media m : itemsInStore){
            if (m.getTitle().equals(inputTitle)){
                return true;
            }
        }
        return false;
    }
    public Media returnMedia(String inputTitle){
        for (Media m : itemsInStore){
            if (m.getTitle().equals(inputTitle)){
                return m;
            }
        }
        return null;
    }
    public void showItemInfo(Media m){
        System.out.println(m.toString());
    }
}
