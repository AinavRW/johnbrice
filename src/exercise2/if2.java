package exercise2;

public class if2 {
	public static void main(String[] args) {
		int num = 1;
		int den = 7;

		if (den == 0) {
			den = 6;
			if (den == 0) {
				den = 7;
				if (den == 0) {
					den = 8;
					{
					}

				}

			}

		}
		System.out.println(num / den);
	}
}