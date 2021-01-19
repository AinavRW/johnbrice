package exercise4;

public class While7 {
	public static void main(String[] args) {
		int num = -10 + (int) (Math.random() * 101);
		int highestNum = 0;

		while (num > 0 || num != 0 ) {
			if (num > highestNum) {
				highestNum = num;

			}
			num = -10 + (int) (Math.random() * 101);

		}
		System.out.println(highestNum);
	}

}
