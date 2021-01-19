package exercise4;

public class While5 {
	public static void main(String[] args) {
		int lastNum = -99;
		int num = -101 + (int) (Math.random() * 101);
		int sum = 0;

		while (num != lastNum) {
			num = -101 + (int) (Math.random() * 101);
			sum += num;
			

		}
		System.out.println(sum);

	}

}
