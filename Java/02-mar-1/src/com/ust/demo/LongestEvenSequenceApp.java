package com.ust.demo;

import java.util.Arrays;
import java.util.Scanner;

public class LongestEvenSequenceApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//now we got inputs. Check if inputs obtained correctly or not by printing

		int maxCount=0;
		int count=0;
		int startIndex=-1;
		int maxStartIndex=-1;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
				if(count==1)
				{
					startIndex=i;
				}
				if(count>maxCount)
				{
					maxCount=count;
					maxStartIndex=startIndex;
				}
//				System.out.println(arr[i]+"\tCount:"+count+"\tMaxCount:"+maxCount+"\tStartIndex:"+startIndex+"\tMaxStIndex:"+maxStartIndex);
			}else
			{
				count=0;
			}
		}
		System.out.println(maxCount);
		System.out.println(maxStartIndex);
	}

}

