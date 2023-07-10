package com.suresh;

public class Program2 {
	static int findPeak(int arr[], int n) {
		if (n == 1)
			return 0;
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1 };
		int n = arr.length;
		System.out.print("Index of a peak point is " + findPeak(arr, n));
	}
}