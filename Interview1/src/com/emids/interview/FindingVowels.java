package com.emids.interview;

public class FindingVowels {

	public static Integer vowels(String s) {
		if (s.isEmpty()) {
			return 0;
		}
		if (s.length() == 1) {
			return 1;
		}
		if (s == null) {
			return null;
		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}

		}
		System.out.println(s + ":" + count);

		return count;

	}

	public static void main(String[] args) {

		String s = "I have to find vowels in given string";
//String s=" ";

		System.out.println(vowels(s));
	}

}
