package com.suresh;

import java.util.*;

public class Program8 {
	int findCrossOver(int arr[], int low, int high, int x) {
		if (arr[high] <= x)
			return high;
		if (arr[low] > x)
			return low;
		int mid = (low + high) / 2;
		if (arr[mid] <= x && arr[mid + 1] > x)
			return mid;
		if (arr[mid] < x)
			return findCrossOver(arr, mid + 1, high, x);

		return findCrossOver(arr, low, mid - 1, x);
	}

	void printKclosest(int arr[], int x, int k, int n) {
		int l = findCrossOver(arr, 0, n - 1, x);
		int r = l + 1;
		int count = 0;
		if (arr[l] == x)
			l--;
		while (l >= 0 && r < n && count < k) {
			if (x - arr[l] < arr[r] - x)
				System.out.print(arr[l--] + " ");
			else
				System.out.print(arr[r++] + " ");
			count++;
		}
		while (count < k && l >= 0) {
			System.out.print(arr[l--] + " ");
			count++;
		}
		while (count < k && r < n) {
			System.out.print(arr[r++] + " ");
			count++;
		}
	}

	public static void main(String args[]) {
		Program8 ob = new Program8();
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int x = -3, k = 4;
		ob.printKclosest(arr, x, 4, n);
	}
}