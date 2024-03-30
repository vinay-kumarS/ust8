import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of colleges:");
		int noOfColleges=sc.nextInt();
		List<College> list=new ArrayList<>();
		for(int i=0;i<noOfColleges;i++)
		{
			String input=sc.nextLine();
			if(input.equals(""))
				input=sc.nextLine();
			
//			IIT Madras,www.iitm.ac.in/,9876543210,Govt of India,15,Chennai,30-05-1959
			College college=new College();
			String[] arr = input.split(",");
			college.setName(arr[0]);
			college.setWebsite(arr[1]);
			college.setMobile(arr[2]);
			college.setFounder(arr[3]);
			college.setNumberOfDept(Integer.valueOf(arr[4]));
			college.setLocation(arr[5]);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
			college.setStartingDate(sdf.parse(arr[6]));
			list.add(college);
		}
		
		Map<String, Integer> result = College.calculateLocationCount(list);
		System.out.format("%-15s %s\n","Location","Count");
		
		for(Entry<String, Integer> entry:result.entrySet())
			System.out.format("%-15s %s\n",entry.getKey(),entry.getValue());
	}

}
