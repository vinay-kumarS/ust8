package com.ust.demo;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputStr=sc.next();
		//since reverse method is not present in String class,
		//we use StringBuilder
		StringBuilder sb=new StringBuilder(inputStr);
//		sb.append(input);
		sb.reverse();
		String reverseStr=sb.toString();
		if(inputStr.equalsIgnoreCase(reverseStr))
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}
	}

}
