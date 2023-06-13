package hust.soict.sec.control_options;

import hust.soict.sec.aims.media.Book;
import hust.soict.sec.aims.media.CompactDisc;
import hust.soict.sec.aims.media.DigitalVideoDisc;
import hust.soict.sec.aims.media.Media;
import hust.soict.sec.aims.store.Store;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UpdateStore {
    public void add(Scanner sc, Store store){
        System.out.println("Choose media type you want to add (dvd/cd/book):");
        String mediaType = sc.next();
        sc.nextLine();

        if (mediaType.equals("dvd")){
            System.out.println("Input info for dvd (title-category-director-length-cost):");
            String input = sc.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(input, "-");

            String[] dvdInfo = new String[5];
            int index = 0;
            while (tokenizer.hasMoreTokens()) {
                dvdInfo[index] = tokenizer.nextToken();
                index++;
            }

            DigitalVideoDisc sampleDvd = new DigitalVideoDisc(dvdInfo[0], dvdInfo[1], dvdInfo[2], Integer.parseInt(dvdInfo[3]),
                    Double.parseDouble(dvdInfo[4]));
            store.addMedia(sampleDvd);
        }else if (mediaType.equals("cd")){
            System.out.println("Input info for cd (title-category-director-length-cost):");
            String input = sc.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(input, "-");

            int tokenCount = tokenizer.countTokens();
            String[] cdInfo = new String[tokenCount];
            int index = 0;
            while (tokenizer.hasMoreTokens()) {
                cdInfo[index] = tokenizer.nextToken();
                index++;
            }

            CompactDisc sampleCd = new CompactDisc(cdInfo[0], cdInfo[1], cdInfo[2], Integer.parseInt(cdInfo[3]),
                    Double.parseDouble(cdInfo[4]));
            store.addMedia(sampleCd);
        }else if (mediaType.equals("book")){
            System.out.println("Input info for book (title-category-cost):");
            String input = sc.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(input, "-");

            int tokenCount = tokenizer.countTokens();
            String[] bookInfo = new String[tokenCount];
            int index = 0;
            while (tokenizer.hasMoreTokens()) {
                bookInfo[index] = tokenizer.nextToken();
                index++;
            }

            Book sampleBook = new Book(bookInfo[0], bookInfo[1], Double.parseDouble(bookInfo[2]));
            store.addMedia(sampleBook);
        }
    }

    public void remove(Scanner sc, Store store){
        System.out.println("List of items in store:");
        store.getItemsInStore();

        System.out.println("Please enter the title of the Media you want to remove:");
        String inputTitle = sc.next();

        if (store.isInStore(inputTitle)){
            store.removeMedia(store.returnMedia(inputTitle));
        }else{
            System.out.println("Media not found in store");
        }
    }
}
