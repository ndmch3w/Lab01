import java.util.Scanner;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input size of array: ");
        n = sc.nextInt();


        int[] arr = new int[n];
        System.out.println("Input elements for array: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Sorted array: ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
