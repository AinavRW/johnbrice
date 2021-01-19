package exercise4;

public class While22 {
	public static void main(String[] args) {
		int value = (int) (Math.random() * 50);
		System.out.println(value);
		int num1 = 1;
		int num2 = 1;

		while (num2 <= value) {
			num2 = num1 + num2;
			num1 = num2 - num1;
			
			System.out.println(num2);
			

		}	

	}

}
