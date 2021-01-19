package hm9;

import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Library myLibrary = new Library();

		printMenu(myLibrary, input);

		input.close();

	}

	private static String getBookNameFromUser(Scanner input, String message) {
		System.out.println("Enter the name of the book" + message);
		String userBookName = input.nextLine();
		return userBookName;
	}

	private static Book getBookfromUser(Scanner input) {

		return new Book(getStringFromUser(input, "Enter the name of the book"),
				getStringFromUser(input, "Enter the name of the book's Auther"),
				getIntFromUser(input, "Enter the year the book was published"));

	}

	private static void printMenu(Library myLibrary, Scanner input) {
		System.out.println("1. Add a book");
		System.out.println("2. Delete a book");
		System.out.println("3. Find a book");
		System.out.println("9. Exit");
		userChoice(myLibrary, input);

	}

	private static void userChoice(Library myLibrary, Scanner input) {
		switch (input.nextLine()) {
		case "1":
			myLibrary.addBook(getBookfromUser(input));
			printMenu(myLibrary, input);
			break;
		case "2":
			myLibrary.removeBook(getBookNameFromUser(input, "to remove")); 
			printMenu(myLibrary, input);
			break;
		case "3":
			Book bookFound = myLibrary.findBook(getBookNameFromUser(input, " to find"));
			System.out.println(bookFound!=null ? bookFound.getName() :"Book was not found");
			printMenu(myLibrary, input);
			break;
		case "9":
			System.out.println("Goodbye!");
			break;
		default:
			System.out.println("please enter a number between 1 and 3 or 9 to exit");
			printMenu(myLibrary, input);
			break;
		}
	}

	private static String getStringFromUser(Scanner input, String msg) {
		System.out.println(msg);
		String s = input.nextLine();
		return s;
	}

	private static int getIntFromUser(Scanner input, String msg) {
		System.out.println("Enter the year the book was published");
		int year = input.nextInt();
		input.nextLine();
		return year;
	}

}
