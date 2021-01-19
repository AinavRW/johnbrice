package exercise4;

public class While14 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 300);
		System.out.println(num);

		int reverse = 0;
		int lastDigit = 0;

		while (num > 0) {
			lastDigit = num % 10;
			reverse = (reverse * 10) + lastDigit;
			num = (int) num / 10;

		}
		System.out.println(reverse);

	}

}
