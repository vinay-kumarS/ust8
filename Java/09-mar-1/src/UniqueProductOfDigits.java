import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueProductOfDigits {

	private static int digitProduct(int num)
	{
		//write your code here
		//get each digit from num
		//by using % 10 operator, we can get last digit of a number
		//by using / 10 operator, we can remove last digit
		//loop untile, the num > 0
		int product=1;
		while(num>0)
		{
			int digit=num%10;		//last digit
			product*=digit;
			num/=10;
		}
		return product;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		///write code here...
		Set<Integer> set=new LinkedHashSet<>();
		for(int x : arr)
		{
//			System.out.print(x+"\t");
			//find the product of digits
			int product = digitProduct(x);
//			System.out.println(product);
			set.add(product);
		}
		
		System.out.println(set.size());
	}

}
