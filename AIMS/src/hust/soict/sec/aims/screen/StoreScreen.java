/*
package hust.soict.sec.aims.screen;

import javax.swing.*;

import hust.soict.sec.aims.cart.Cart;
import hust.soict.sec.aims.media.*;
import hust.soict.sec.aims.store.Store;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StoreScreen extends JFrame {
    private Store store;
    private Cart cart;

    public Cart getCart() {
        return cart;
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());

        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Option");

        JMenu smUpdateStore = new JMenu("Update store");
        smUpdateStore.add("Add DVD");
        smUpdateStore.add("Add CD");
        smUpdateStore.add("Add Book");

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.PINK);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cart);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < 9; i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i), this);
            center.add(cell);
        }

        return center;
    }

    public StoreScreen(Store store, Cart testCart) {
        this.store = store;
        this.cart = testCart;

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Store testStore = new Store();
        Cart testCart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);

        ArrayList<Track> cd1Tracks = new ArrayList<Track>();
        cd1Tracks.add(new Track("Time", 6));
        cd1Tracks.add(new Track("Space", 4));
        CompactDisc cd1 = new CompactDisc("cd1", 10, "Tou", "SS", cd1Tracks);

        List<String> authorsBook1 = new ArrayList<String>();
        authorsBook1.add("Lee James");
        authorsBook1.add("Robert Green");
        Book book1 = new Book("Orange", "Novel", 3.4, authorsBook1);

        testStore.addMedia(dvd1);
        testStore.addMedia(dvd2);
        testStore.addMedia(dvd3);
        testStore.addMedia(dvd4);
        testStore.addMedia(dvd5);
        testStore.addMedia(dvd6);
        testStore.addMedia(dvd7);
        testStore.addMedia(cd1);
        testStore.addMedia(book1);

        new StoreScreen(testStore, testCart);
    }
}
*/

package hust.soict.sec.aims.screen;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;



import hust.soict.sec.aims.store.Store;
import hust.soict.sec.aims.cart.Cart;
import hust.soict.sec.aims.media.*;


public class StoreScreen extends JFrame {
    private static Store store = new Store();
    private static Cart cart = new Cart();

    public static void initSetup() {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("The Lion King", "Animation", "James Cameron",
                120, 10.1);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(dvd4);
        store.addMedia(dvd5);
        store.addMedia(dvd6);
        store.addMedia(dvd7);

        Book book = new Book("The Valley of Fear", "Detective", 20.00);
        store.addMedia(book);

        ArrayList<Track> cd1Tracks = new ArrayList<Track>();
        cd1Tracks.add(new Track("Time", 6));
        cd1Tracks.add(new Track("Space", 4));
        CompactDisc cd1 = new CompactDisc("cd1", 10, "Tou", "SS", cd1Tracks);
        cd1.addTrack(new Track("World", 5));
        store.addMedia(cd1);


    }

    public static void main(String[] args) {
        initSetup();
        new StoreScreen(store);
    }


    public StoreScreen(Store store) {
        StoreScreen.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setTitle("Store");
        setSize(1024, 768);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {

        JMenu menu = new JMenu("Options");

        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem smAddBook = new JMenuItem("Add Book");
        JMenuItem smAddCD = new JMenuItem("Add CD");
        JMenuItem smAddDVD = new JMenuItem("Add DVD");
        smUpdateStore.add(smAddBook);
        smUpdateStore.add(smAddCD);
        smUpdateStore.add(smAddDVD);

        smAddBook.addActionListener(new btnMenuListener());
        smAddCD.addActionListener(new btnMenuListener());
        smAddDVD.addActionListener(new btnMenuListener());

        menu.add(smUpdateStore);

        JMenuItem viewStoreMenu = new JMenuItem("View store");
        JMenuItem viewCartMenu = new JMenuItem("View cart");
        menu.add(viewStoreMenu);
        menu.add(viewCartMenu);
        viewStoreMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreScreen(store);
            }
        });
        viewCartMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CartScreen(cart);
            }
        });

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    private class btnMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Add Book")) {
                new AddBookToStoreScreen(store);
            } else if (command.equals("Add CD")) {
                new AddCompactDiscToStoreScreen(store);
            } else if (command.equals("Add DVD")) {
                new AddDigitalVideoDiscToStoreScreen(store);
            }
        }
    }

    JPanel createHeader() {

        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cartBtn = new JButton("View cart");
        cartBtn.setPreferredSize(new Dimension(100, 50));
        cartBtn.setMaximumSize(new Dimension(100, 50));
        cartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CartScreen(cart);
            }
        });



        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(cartBtn);
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));


        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (int i = 0; i < mediaInStore.size(); i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
            center.add(cell);
        }

        return center;
    }

}
