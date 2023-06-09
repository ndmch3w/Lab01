package hust.soict.sec.control_options;

import hust.soict.sec.aims.Aims;
import hust.soict.sec.aims.cart.Cart;
import hust.soict.sec.aims.media.Disc;
import hust.soict.sec.aims.media.Media;
import hust.soict.sec.aims.store.Store;

import java.util.Collections;
import java.util.Scanner;

public class SeeCurrentCart {
    public void show(Cart cart, int cartMenuChoice, Scanner sc){
        while(cartMenuChoice != 0){
            Aims.cartMenu();
            cartMenuChoice = sc.nextInt();
            switch (cartMenuChoice){
                case 0:
                    break;
                case 1: // Filter media in cart (cart menu)
                    System.out.println("Choose filtering options (id/title):");
                    String filterOption = sc.next();

                    if (filterOption.equals("id")){
                        for (Media m : cart.getItemsOrdered()) {
                            System.out.println(m.getId());
                        }
                    }else if (filterOption.equals("title")){
                        for (Media m : cart.getItemsOrdered()){
                            System.out.println(m.getTitle());
                        }
                    }else{
                        System.out.println("Wrong input");
                    }
                    break;
                case 2: // Sort media in cart (cart menu)
                    System.out.println("Sort by (title/cost):");
                    String sortOption = sc.next();

                    if (sortOption.equals("title")){
                        Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
                        for (Media m : cart.getItemsOrdered()){
                            System.out.println(m.toString());
                        }
                    }else if (sortOption.equals("cost")){
                        Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
                        for (Media m : cart.getItemsOrdered()){
                            System.out.println(m.toString());
                        }
                    }else{
                        System.out.println("Wrong input");
                    }
                    break;
                case 3: // Remove media from cart (cart menu)
                    System.out.println("Please enter the title of the Media you want to remove:");
                    sc.nextLine();
                    String inputTitle = sc.nextLine();

                    Media userAskMedia = cart.returnMedia(inputTitle);
                    cart.removeMedia(userAskMedia);
                    break;
                case 4: // Play a media (cart menu)
                    System.out.println("Please enter the title of the Media you want to play:");
                    sc.nextLine();
                    String inputTitle2 = sc.nextLine();

                    Media userAskMedia2 = cart.returnMedia(inputTitle2);

                    if (userAskMedia2.getClass().getName().equals("DigitalVideoDisc")
                            || userAskMedia2.getClass().getName().equals("CompactDisc")){
                        ((Disc)userAskMedia2).play();
                    }else{
                        System.out.println("Only DVDs and CDs can be played");
                    }
                    break;
                case 5: // Place Order (cart menu)
                    cart.emptyCart();
                    System.out.println("Order is successfully placed");
                    break;
            }
        }
    }
}
