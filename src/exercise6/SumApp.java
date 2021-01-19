package exercise6;

public class SumApp {

	public static void main(String[] args) {
		SumEvenOdd sum = new SumEvenOdd(200);

		for (int i = 1; i <= 10; i++) {
			sum.add(i);
		}

		System.out.println("Even sum:" + sum.getEvenSum());
		System.out.println("Odd sum:" + sum.getOddSum());
	}

}
