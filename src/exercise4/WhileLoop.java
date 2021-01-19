package exercise4;

public class WhileLoop {
	public static void main(String[] args) {
		int line = 0;
		int lines = 4;
		String row = "";
		while (line <= lines) {
			row += "*";
			System.out.println(row);
			line += 1;
		}
	}

}
