package exercise3;

public class One {
	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 8;
		int num3 = 10;

		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			} else {
				System.out.println(num1);
				System.out.println(num3);
				System.out.println(num2);

			}

		}

		else if (num2 < num3 && num1 < num2) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		} else {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);

		}

	}

}
