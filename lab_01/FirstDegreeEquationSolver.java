package lab_01;

import java.util.*;

public class FirstDegreeEquationSolver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Input a: ");
		a = sc.nextDouble();
		System.out.println("Input b: ");
		b = sc.nextDouble();
		System.out.format("Result of ax+b is: %.2f", (-b/a));
		sc.close();
	}
}