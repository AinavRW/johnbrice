package exercise4;

public class While23 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100);
		System.out.println(num);
		int i = num;

		while (i > 0) {
			if (num % i == 0) {
				System.out.println(i);

			}
			i--;

		}
	}

}
