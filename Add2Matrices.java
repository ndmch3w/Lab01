package lab_01;

import java.util.*;

public class Add2Matrices {
	public static void main(String[] args) {
		int row, column;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of rows: ");
		row = sc.nextInt();
		System.out.println("Input number of columns: ");
		column = sc.nextInt();
		
		double[][] a = new double[row][column];
		double[][] b = new double[row][column];
		double[][] res = new double[row][column];
		
		System.out.println("Input elements for matrix a: ");
		for (int i=0; i<row; i++) {
			System.out.println("Row " + (i+1));
			for (int j=0; j<column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Input elements for matrix b: ");
		for (int i=0; i<row; i++) {
			System.out.println("Row " + (i+1));
			for (int j=0; j<column; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Result of a + b:");
		for (int i=0; i<row; i++) {
			for (int j=0; j<column; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
