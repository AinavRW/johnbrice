package exercise2;

public class Nine {
	public static void main(String[] args) {

		int num = 16;
		int rightDigit = num % 10;
		int leftDigit = num / 10;
		System.out.println(rightDigit * 10 + leftDigit);
	}

}
