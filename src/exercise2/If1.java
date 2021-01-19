package exercise2;

public class If1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 15;

		if (num1 % num2 == 0) {
			System.out.println(num1);
		}
		if (num2 % num1 == 0) {
			System.out.println(num2);
		} else {
			System.out.println("nope");
		}
	}

}