package exercise5;

import java.util.Arrays;

public class ArrayCopy2 {
	public static void main(String[] args) {
		int[] nums = new int[50];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100);

		}
		int[] numsCopy = new int[10];
		System.arraycopy(nums, 14, numsCopy, 0, 10);

		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(numsCopy));

	}

}
