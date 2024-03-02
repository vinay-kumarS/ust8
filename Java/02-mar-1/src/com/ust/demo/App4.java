package com.ust.demo;

import java.util.*;

public class App4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str1 = scanner.nextLine();
//str1=str1.toLowerCase().replaceAll("\\s", "");
		String str2 = scanner.nextLine();
//str2=str2.toLowerCase().replaceAll("\\s", "");

		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		str1 = new String(charArray1);
		str1 = str1.trim();

		str2 = new String(charArray2);
		str2 = str2.trim();

//if (Arrays.equals(charArray1, charArray2)) {
		if (str1.equals(str2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an anagram");
		}

	}
}