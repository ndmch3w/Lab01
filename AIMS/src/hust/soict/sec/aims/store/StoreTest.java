package hust.soict.sec.aims.store;

import hust.soict.sec.aims.disc.DigitalVideoDisc;
import hust.soict.sec.aims.store.Store;

public class StoreTest {
    public static void main(String[] args){
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin", "Animation", 18.99);
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);

        Store store = new Store();

        store.addDVD(dvd1);
        store.addDVD(dvd4);
        store.addDVD(dvd5);

        System.out.println(store.getItemsInStore());

        store.removeDVD(dvd4);

        System.out.println(store.getItemsInStore());
    }
}
