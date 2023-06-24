package hust.soict.sec.aims.screen;

import hust.soict.sec.aims.cart.Cart;
import hust.soict.sec.aims.media.Book;
import hust.soict.sec.aims.media.DigitalVideoDisc;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

public class CartScreen extends JFrame {
    private Cart cart;

    public CartScreen(Cart cart){
        super();

        this.cart = cart;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Cart");
        this.setSize(600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try{
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/cart.fxml"));
                    CartScreenController controller = new CartScreenController(cart);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args){
        // Create a new cart
        Cart cart = new Cart();

        // Add two digital video discs to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("dvd1", "comedy", 80.1);
        Book book1 =  new Book("book1", "fiction", 4.5);
        cart.addMedia(dvd1);
        cart.addMedia(book1);

        // Create and show the cart screen
        CartScreen cartScreen = new CartScreen(cart);
    }
}


