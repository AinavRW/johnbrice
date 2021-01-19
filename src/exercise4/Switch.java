package exercise4;

public class Switch {
	public static void main(String[] args) {
		String TVChannel = "Sport 1";

		switch (TVChannel) {
		case "13":
			System.out.println("I do not watch it");
			break;
		case "1":
			System.out.println("Good Movies");
		case "82":
			System.out.println("Good News");

		default:
			System.out.println("Stop Thinking About Football");
			break;
		}

	}

}
