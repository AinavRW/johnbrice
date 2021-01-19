package hm9;

public class Library {
	private Book[] books;

	public Library() {
		this.books = new Book[100];
	}

	public boolean addBook(Book book) {
		int idx = getFirstEmptyIndex(books);
		if (idx < books.length) {
			books[idx] = book;
			System.out.println("book added: " + book.getName());
		} else {
			System.out.println("not added: " + book.getName());
		}
		return idx < books.length;
	}

	public Book findBook(String name) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].getName().equalsIgnoreCase(name)) {
				System.out.println("book found");
				return books[i];
			}

		}
		return null;
	}

	public boolean removeBook(String name) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null && books[i].getName().equalsIgnoreCase(name)) {
				books[i] = null;
				return true;
			}

		}
		return false;
	}

	private int getFirstEmptyIndex(Book[] books) {
		int i = 0;
		for (; i < books.length && books[i] != null; i++) {
		}
		return i;
	}

}
