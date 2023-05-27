public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.showBill();

        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.showBill();

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Aladin", "Animation", 18.99);
        DigitalVideoDisc[] dvdList1 = {dvd4, dvd5};
        anOrder.addDigitalVideoDisc(dvdList1);
        anOrder.showBill();

        System.out.println("Number of discs: " + DigitalVideoDisc.nbDigitalVideoDisc);
        System.out.println("Number of discs: " + DigitalVideoDisc.nbDigitalVideoDisc);
    }
}
