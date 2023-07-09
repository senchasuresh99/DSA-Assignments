package com.suresh;

public class Program5 {
	public static int arrangeCoins(int n) {
		long l = 0, r = n;
		long mid, k;
		while (l <= r) {
			mid = l + (r - l) / 2;
			k = mid * (mid + 1) / 2;
			if (k == n) {
				return (int) mid;
			} else if (k < n) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return (int) r;
	}

	public static void main(String[] args) {
		int nums = 5;
		System.out.println(arrangeCoins(nums));
	}
}