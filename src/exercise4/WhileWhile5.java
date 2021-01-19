package exercise4;

public class WhileWhile5 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 50);
		int nonPrime = 0;
		int i = 2;

		while (i < num) {
			while (num % i == 0) {
				nonPrime++;
				num = (int) (Math.random() * 50);

			}
			i++;

		}
		System.out.println(nonPrime);
	}

}
