package hm9;

public class Book {
	private String name;
	private String auther;
	private int yearPublished;

	public Book(String name, String auther, int yearPublished) {
		this.name = name;
		this.auther = auther;
		this.yearPublished = yearPublished;
	}

	public String getName() {
		return name;
	}

	public String getAuther() {
		return auther;
	}

	public int getYearPublished() {
		return yearPublished;
	}

}
