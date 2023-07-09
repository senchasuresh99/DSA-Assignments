package com.suresh;

public class Program2 {
	public static boolean checkValidString(String s) {
		int right = 0, left = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == '(')
				left++;
			else
				left--;

			if (ch != ')')
				right++;
			else
				right--;

			if (right < 0)
				break;

			left = Math.max(0, left);
		}

		return left == 0;
	}

	public static void main(String[] args) {
		String nums = "()";
		System.out.println(checkValidString(nums));
	}
}