package testReview;

public class Q1 {
	public static void main(String[] args) {

		int num = -2 + (int) (Math.random() * 10);
		int[][] mostEvens = new int[2][3];
		int lastDig = 0;
		int evenCount = 0;

		while (num != -1) {
			num = -2 + (int) (Math.random() * 10);
			while (num > 0) {
				lastDig = num % 10;
				num = num / 10;
				if (lastDig % 2 == 0) {
					evenCount++;

				}
				
				int [] values = new int [2];
				values[0] = num;
				values[1] = evenCount;
				
				if (mostEvens [0][1] < values[1]) {
					mostEvens[0][0] = num;
					mostEvens[0][1] = evenCount;
	
				}
				
				

			}

		}
	}

}
