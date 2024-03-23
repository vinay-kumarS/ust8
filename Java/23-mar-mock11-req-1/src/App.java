import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws NumberFormatException, ParseException {
		Scanner sc=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter college 1 detail:");
		String input1=sc.nextLine();
		System.out.println("Enter college 2 detail:");
		String input2=sc.nextLine();
		
		String[] arr = input1.split(",");
//		IIT Madras,www.iitm.ac.in,7845612390,iit,16,Madras,15-12-1959
		College college1=new College(arr[0], arr[1], arr[2], arr[3], Integer.valueOf(arr[4]), arr[5], sdf.parse(arr[6]));
		
		String []arr2=input2.split(",");
		College college2 = new College();
		//use setter methods to fill the values
		college2.setName(arr2[0]);
		college2.setWebsite(arr2[1]);
		college2.setMobile(arr2[2]);
		college2.setFounder(arr2[3]);
		college2.setNumberOfDept(Integer.valueOf(arr2[4]));
		college2.setLocation(arr2[5]);
		college2.setStartingDate(sdf.parse(arr2[6]));
		
		System.out.println("College 1:");
		System.out.println(college1);
		System.out.println();
		System.out.println("College 2:");
		System.out.println(college2);
		
		//check if college1 and college2 are same or different
		if(college1.equals(college2))
		{
			System.out.println("College 1 is same as College 2");
		}
		else
		{
			System.out.println("College 1 and College 2 are different");
		}
	}

}
