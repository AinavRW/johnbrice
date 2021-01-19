package exercise4;

public class ForLoop {
	public static void main(String[] args) {

		int lines = 5;
		String row = "";

		for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= i; j++) {
				row += "*";

			}
			System.out.println(row);
			row = "";

		}
	}

}
