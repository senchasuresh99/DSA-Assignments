package com.suresh;

public class Program5 {
	public static int[] plusOne(int[] digits) {

		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] < 9) {
				digits[i] = digits[i] + 1;
				return digits;

			} else if (digits[i] == 9) {
				digits[i] = 0;
			}
		}

		int[] arr = new int[digits.length + 1];
		arr[0] = 1;
		return arr;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		System.out.println(plusOne(nums));
	}
}