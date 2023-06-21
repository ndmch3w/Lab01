package hust.soict.sec.aims.cart;

import hust.soict.sec.aims.media.DigitalVideoDisc;
import hust.soict.sec.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();

    public int getCartSize(){
        return itemsOrdered.size();
    }

    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void addMedia(Media sampleMedia){
        if (itemsOrdered.size() == 20){
            System.out.println("Cart is full");
        }else{
            itemsOrdered.add(sampleMedia);
            System.out.println("Add successfully");
        }
    }
    public void removeMedia(Media sampleMedia){
        if (itemsOrdered.isEmpty()){
            System.out.println("Cart is empty");
        }else if (itemsOrdered.contains(sampleMedia)){
            itemsOrdered.remove(sampleMedia);
            System.out.println("Remove successful");
        }else{
            System.out.println("Media not found");
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
                    + ". Price: " + itemsOrdered.get(i).getCost());
        }
        System.out.println("Total cost: " + this.totalCost());
    }

    // To search DVD by id and by title in cart
    public boolean isMatch(int id){
        for (int i=0; i<itemsOrdered.size(); i++){
            if (id == itemsOrdered.get(i).getId()){
                return true;
            }
        }
        return false;
    }
    public boolean isMatch(String title) {
        for (int i = 0; i < itemsOrdered.size(); i++) {
            if (title.equals(itemsOrdered.get(i).getTitle())) {
                return true;
            }
        }
        return false;
    }
    public Media returnMedia(String title){
        if (isMatch(title)){
            for (int i=0; i<itemsOrdered.size(); i++){
                if (title.equals(itemsOrdered.get(i).getTitle())){
                    return itemsOrdered.get(i);
                }
            }
        }
        return null;
    }
    public void emptyCart(){
        itemsOrdered.clear();
    }
}
