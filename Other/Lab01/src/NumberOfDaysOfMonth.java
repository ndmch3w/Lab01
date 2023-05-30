import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfDaysOfMonth {
    public static void main(String[] args) {
        ArrayList<String> jan = new ArrayList<>(Arrays.asList("January", "Jan", "Jan.", "1"));
        ArrayList<String> feb = new ArrayList<>(Arrays.asList("February", "Feb", "Feb.", "2"));
        ArrayList<String> mar = new ArrayList<>(Arrays.asList("March", "Mar", "Mar.", "3"));
        ArrayList<String> apr = new ArrayList<>(Arrays.asList("April", "Apr", "Apr.", "4"));
        ArrayList<String> may = new ArrayList<>(Arrays.asList("May", "May", "May.", "5"));
        ArrayList<String> jun = new ArrayList<>(Arrays.asList("June", "Jun", "Jun.", "6"));
        ArrayList<String> jul = new ArrayList<>(Arrays.asList("July", "Jul", "Jul.", "7"));
        ArrayList<String> aug = new ArrayList<>(Arrays.asList("August", "Aug", "Aug.", "8"));
        ArrayList<String> sep = new ArrayList<>(Arrays.asList("September", "Sep", "Sep.", "9"));
        ArrayList<String> oct = new ArrayList<>(Arrays.asList("October", "Oct", "Oct.", "10"));
        ArrayList<String> nov = new ArrayList<>(Arrays.asList("November", "Nov", "Nov.", "11"));
        ArrayList<String> dec = new ArrayList<>(Arrays.asList("December", "Dec", "Dec.", "12"));

        // Place all valid inputs in a ArrayList
        ArrayList<String> validInput = new ArrayList<>();
        validInput.addAll(jan);
        validInput.addAll(feb);
        validInput.addAll(mar);
        validInput.addAll(apr);
        validInput.addAll(may);
        validInput.addAll(jun);
        validInput.addAll(jul);
        validInput.addAll(aug);
        validInput.addAll(sep);
        validInput.addAll(oct);
        validInput.addAll(nov);
        validInput.addAll(dec);

        Scanner sc = new Scanner(System.in);
        String month;
        int year;

        System.out.println("Input month: ");
        month = sc.nextLine();
        while(validInput.contains(month) == false) {
            System.out.println("Invalid month input. Please input again: ");
            month = sc.nextLine();
        }

        System.out.println("Input year: ");
        year = sc.nextInt();

        if (jan.contains(month) || mar.contains(month) || may.contains(month) || jul.contains(month) || aug.contains(month) || oct.contains(month) || dec.contains(month)) {
            System.out.println("31 days in this month");
        }else if (apr.contains(month) || jun.contains(month) || sep.contains(month) || nov.contains(month)) {
            System.out.println("30 days in this month");
        }else {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("28 days in this month");
            }else if (year % 4 == 0) {
                System.out.println("29 days in this month");
            }else {
                System.out.println("28 days in this month");
            }
        }

    }
}
