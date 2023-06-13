package hust.soict.sec.aims;

import hust.soict.sec.aims.cart.Cart;
import hust.soict.sec.aims.media.CompactDisc;
import hust.soict.sec.aims.media.DigitalVideoDisc;
import hust.soict.sec.aims.media.Disc;
import hust.soict.sec.aims.media.Media;
import hust.soict.sec.aims.store.Store;
import hust.soict.sec.control_options.SeeCurrentCart;
import hust.soict.sec.control_options.UpdateStore;

import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }

    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        Scanner sc = new Scanner(System.in);

        int mainMenuChoice = 999;

        while (mainMenuChoice != 0) {
            showMenu();
            mainMenuChoice = sc.nextInt();

            switch (mainMenuChoice) {
                case 0:
                    return;  // Exit the program
                case 1: // View store (main menu)
                    int storeMenuChoice = 999;
                    while (storeMenuChoice != 0) {
                        storeMenu();
                        storeMenuChoice = sc.nextInt();

                        switch (storeMenuChoice) {
                            case 0:
                                break;  // Exit the inner loop and go back to the main menu
                            case 1: // See media details (store menu)
                                System.out.println("Please enter the title of the Media");
                                sc.nextLine();
                                String inputTitle = sc.nextLine();
                                if (store.isInStore(inputTitle)){
                                    Media userAskMedia = store.returnMedia(inputTitle);
                                    store.showItemInfo(userAskMedia);

                                    int mediaDetailsMenuChoice = 999;

                                    while (mediaDetailsMenuChoice != 0){
                                        mediaDetailsMenu();
                                        mediaDetailsMenuChoice = sc.nextInt();
                                        switch (mediaDetailsMenuChoice){
                                            case 0:
                                                break;
                                            case 1: // Add to cart (media detail menu)
                                                cart.addMedia(userAskMedia);
                                                System.out.println("Number of items in cart: " + cart.getCartSize());
                                                break;
                                            case 2: // Play (media detail menu)
                                                if (userAskMedia != null &&
                                                        (userAskMedia instanceof DigitalVideoDisc
                                                                || userAskMedia instanceof CompactDisc)){
                                                    ((Disc)userAskMedia).play();
                                                }else{
                                                    System.out.println("Only DVDs and CDs can be played");
                                                }
                                                break;
                                        }
                                    }
                                }else{
                                    System.out.println("Media not found");
                                }
                                break;
                            case 2: // Add a media to cart (store menu)
                                System.out.println("List of items in store:");
                                store.getItemsInStore();

                                System.out.println("Please enter the title of the Media you want to add:");
                                sc.nextLine();
                                String inputTitle2 = sc.nextLine();

                                Media userAskMedia2 = store.returnMedia(inputTitle2);
                                if (store.isInStore(inputTitle2)){
                                    cart.addMedia(userAskMedia2);
                                }else{
                                    System.out.println("Media not found in store");
                                }

                                System.out.println("Number of items in cart: " + cart.getCartSize());

                                break;
                            case 3: // Play a media (store menu)
                                System.out.println("Please enter the title of the Media:");
                                sc.nextLine();
                                String inputTitle3 = sc.nextLine();

                                Media userAskMedia3 = store.returnMedia(inputTitle3);
                                if (store.isInStore(inputTitle3)){
                                    ((Disc)userAskMedia3).play();
                                }else{
                                    System.out.println("Media not found in store");
                                }

                                break;
                            case 4: // See current cart (store menu)
                                int cartMenuChoice = 999;
                                SeeCurrentCart seeCurrentCart = new SeeCurrentCart();
                                seeCurrentCart.show(cart, cartMenuChoice, sc);
                                break;
                        }
                    }
                    break;
                    // Exit the outer loop and go back to the main menu
                case 2: // Update store (main menu)
                    System.out.println("Do you want to add or remove media (add/remove):");
                    String updateStoreOption = sc.next();

                    UpdateStore updateStore = new UpdateStore();
                    if (updateStoreOption.equals("add")) {
                        updateStore.add(sc, store);
                    } else if (updateStoreOption.equals("remove")) {
                        updateStore.remove(sc, store);}
                    //storeMenuChoice = 999;
                    break;
                case 3: // See current cart (main menu)
                    int cartMenuChoice = 999;
                    SeeCurrentCart seeCurrentCart = new SeeCurrentCart();
                    seeCurrentCart.show(cart, cartMenuChoice, sc);
                    break;
            }
        }
    }
}

