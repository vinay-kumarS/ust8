package com.ust.demo;

import java.util.Scanner;

public class PatternPrintingApp {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
			

			for(int i=0;i<input;i++)
			{
				for(int k=0;k<input-1;k++)
				{
					System.out.print("\t");					
				}
				
				
				for(int j=0;j<=i;j++)
				{
					System.out.print("*\t");
				}
				System.out.println();
			}
		

	}

}
