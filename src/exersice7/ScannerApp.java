package exersice7;

import java.util.Scanner;

public class ScannerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number");
		while (!sc.hasNextInt()) {
			String nextLine = sc.nextLine();
			System.err.println("that's not a number, dummy! try again: ");
			
		}
		sc.nextLine();
	}

}
