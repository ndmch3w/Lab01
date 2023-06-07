package hust.soict.sec.aims;

import hust.soict.sec.aims.cart.Cart;
import hust.soict.sec.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        anOrder.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        anOrder.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99);
        anOrder.addMedia(dvd3);
        anOrder.showBill();

        anOrder.removeMedia(dvd2);
        anOrder.showBill();

        System.out.println("Number of discs: " + DigitalVideoDisc.nbDigitalVideoDisc);

        System.out.println(anOrder.isMatch(3));
        System.out.println(anOrder.isMatch("Aladin"));
    }
}
