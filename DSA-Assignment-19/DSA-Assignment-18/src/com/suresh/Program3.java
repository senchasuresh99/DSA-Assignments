package com.suresh;

public class Program3 extends VersionControl {
	public int firstBadVersion(int n) {
		int left = 1, right = n;
		while (left < right) {
			int mid = (left + right) >>> 1;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}
}