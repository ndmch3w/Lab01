import java.util.ArrayList;

public class Store {
    private static ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public ArrayList<DigitalVideoDisc> getItemsInStore(){
        return itemsInStore;
    }
    public void addDVD(DigitalVideoDisc dvd){
        itemsInStore.add(dvd);
    }
    public void removeDVD(DigitalVideoDisc dvd){
        itemsInStore.remove(dvd);
    }
}
