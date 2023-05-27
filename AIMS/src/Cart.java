import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);


    public int qtyOrdered(){
        return itemsOrdered.size();
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
            System.out.println("The disc has been added");
        }else {
            System.out.println("The cart is full");
        }
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        if (this.qtyOrdered() + dvdList.length < MAX_NUMBERS_ORDERED) {
            for (int i=0; i<dvdList.length; i++) {
                itemsOrdered.add(dvdList[i]);
            }
            System.out.println("The discs have been added");
        }else {
            System.out.println("The cart is full");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered() > 0) {
            itemsOrdered.remove(disc);
            System.out.println("Remove 1 disc successfully (If you want to remove 2 or more same discs, "
                    + "please continue removing)");
        }else {
            System.out.println("Cart has no disc");
        }
    }
    public double totalCost() {
        double sum = 0;
        if (itemsOrdered.size() != 0) {
            for (int i=0; i<itemsOrdered.size(); i++) {
                sum += itemsOrdered.get(i).getCost();
            }
        }
        return sum;
    }
    public void showBill() {
        System.out.println("Your bill:");
        for (int i=0; i<itemsOrdered.size(); i++) {
            System.out.println((i+1) + "-" + itemsOrdered.get(i).getTitle() + "-" + itemsOrdered.get(i).getCategory()+ "-"
                    + itemsOrdered.get(i).getDirector() + "-" + itemsOrdered.get(i).getLength() + ". Price: "
                    + itemsOrdered.get(i).getCost());
        }
        System.out.println("Total cost: " + this.totalCost());
    }
    public boolean isMatch(DigitalVideoDisc dvd){
        return true;
    }
}
