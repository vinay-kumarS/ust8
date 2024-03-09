import java.util.Arrays;
import java.util.Scanner;

public class MobileLockPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sideLength=sc.nextInt();
		int points=sc.nextInt();
		int coordinates[][]=new int[points][2];
		boolean isValid=true;
		for(int i=0;i<points;i++)
		{
			coordinates[i][0]=sc.nextInt();
			coordinates[i][1]=sc.nextInt();
		}
		
//		System.out.println(Arrays.deepToString(coordinates));
		
		//walk through the coordinates
		for(int i=0;i<points-1;i++)
		{
			int x1=coordinates[i][0];
			int y1=coordinates[i][1];
			
			int x2=coordinates[i+1][0];
			int y2=coordinates[i+1][1];
			
//			System.out.println(x1+"\t"+y1);
//			System.out.println(x2+"\t"+y2);
			
//			System.out.println();
//			the absolute difference should be <=1
			int diffX=Math.abs(x1-x2);
			int diffY=Math.abs(y1-y2);
			if(diffX>1 || diffY>1 )
			{
				isValid=false;
				break;
			}
			
		}
		if(isValid)
		{
			//check grade
			int total=sideLength*sideLength;
			float coverage=(float)points/total*100;
			if(coverage>75)
			{
				System.out.println("Excellent");
			}else if(coverage>50)
			{
				System.out.println("Good");
			}else if(coverage>25)
			{
				System.out.println("Average");
			}else
			{
				System.out.println("Poor");
			}
		}else
		{
			System.out.println("Invalid");
		}
	}

}
