package exercise3;

public class Two {
	public static void main(String[] args) {
		int grade = 85;

		if (grade < 55) {
			System.out.println("F");
		} else if (grade >= 55 && grade < 65) {
			System.out.println("D");
		} else if (grade >= 65 && grade < 75) {
			System.out.println("C");
		} else if (grade >= 75 && grade < 85) {
			System.out.println("B");
		} else if (grade >= 85 && grade < 95) {
			System.out.println("A");
		} else if (grade >= 95) {
			System.out.println("A+");

		}

	}

}
