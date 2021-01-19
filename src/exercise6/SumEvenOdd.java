package exercise6;

public class SumEvenOdd {
	private Sum sumEven;
	private Sum sumOdd;
	
	public SumEvenOdd (int defaultValue) {
		Sum sumEven = new Sum(defaultValue);
		 Sum sumOdd = new Sum(defaultValue);

	}

	public void add(int i) {
		if ((i % 2) == 0) {
			sumEven.add(i);

		} else {
			sumOdd.add(i);
		}

	}

	public int getEvenSum() {
		return sumEven.getSum();

	}

	public int getOddSum() {
		return sumOdd.getSum();

	}
}
