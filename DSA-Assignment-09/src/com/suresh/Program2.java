package com.suresh;

public class Program2 {
	static int findSum(int n) {
		int sum = 0;
		for (int x = 1; x <= n; x++)
			sum = sum + x;
		return sum;
	}

	public static void main(String args[]) {
		int n = 5;
		System.out.println(findSum(n));
	}
}