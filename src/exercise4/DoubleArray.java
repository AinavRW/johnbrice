package exercise4;

import java.util.Arrays;

public class DoubleArray {
	public static void main(String[] args) {

		int[] nums1 = new int[10];
		int[] nums2 = new int[10];


		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 101);
			nums2[i] = (int) (Math.random() * 101);
		}
		int [] result = new int[10];
		for (int i = 0; i < result.length; i++) {
			result[i] = nums1[i] * nums2[i];
			
		}
		System.out.println(Arrays.toString(result));

	}
}