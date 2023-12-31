package com.suresh;

public class Program6 {
	public static boolean rotateString(String s, String goal) {
		if (s.length() != goal.length())
			return false;
		if (s.equals(goal))
			return true;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < s.length(); i++) {
			sb.append(s.substring(1)).append(s.charAt(0));
			s = sb.toString();
			if (s.equals(goal))
				return true;
			sb.setLength(0);
		}
		return false;
	}

	public static void main(String[] args) {
		String ss = "abcde";
		String k = "cdeab";
		System.out.println(rotateString(ss, k));
	}

}
