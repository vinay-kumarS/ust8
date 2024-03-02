package com.ust.demo;


import java.util.Arrays;

public class App3 {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "abcde";
		if (str1.length() != str1.length()) {
			System.out.println("Not Anagram");
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean ans = Arrays.equals(charArray1, charArray2);
		if (ans) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}
}