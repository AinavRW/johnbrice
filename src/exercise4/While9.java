package exercise4;

public class While9 {
	public static void main(String[] args) {
		int i = 0;
		int highestIndex = 0;
		int highestNum = 0;

		while (i <= 100) {
			int num = (int) (Math.random() * 101);
			if (num > highestNum) {
				highestNum = num;
				highestIndex = i;

			}
			i++;

		}
		System.out.println(highestIndex);
	}

}
