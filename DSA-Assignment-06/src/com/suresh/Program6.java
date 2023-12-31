package com.suresh;

import java.util.*;

public class Program6 {
	public static int[] findOriginalArray(int[] changed) {
		int[] temp = new int[changed.length / 2];
		Queue<Integer> x = new LinkedList<>();
		Arrays.sort(changed);
		int i = 0;
		for (int num : changed) {
			if (!x.isEmpty() && x.peek() == num)
				temp[i++] = x.poll() / 2;
			else
				x.add(num * 2);
		}
		return x.size() > 0 ? new int[] {} : temp;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 4, 2, 6, 8 };
		System.out.println(findOriginalArray(nums));
	}

}
