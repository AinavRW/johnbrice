package exercise4;

public class WhileRandom {
	public static void main(String[] args) {
		int i = 0;

		int random = (int) (Math.random() * 101);

		while (i < 100 && random % 7 != 0) {
			i++;
			random = (int) (Math.random() * 101);

		}
		System.out.println(i);

	}

}
