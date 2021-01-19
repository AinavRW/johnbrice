package exercise5;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int nums[] = new int[100];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);

		}
		int[] numsCopy = new int[200];
		System.arraycopy(nums, 0, numsCopy, 0, 100);

		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(numsCopy));
	}

}
