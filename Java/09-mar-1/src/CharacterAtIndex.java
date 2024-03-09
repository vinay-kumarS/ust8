import java.util.Scanner;

public class CharacterAtIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int index=sc.nextInt();
		if(index<0)
		{
			System.out.println("Invalid ");
			System.exit(0);
		}
		
		index%=str.length();
		char output = str.charAt(index);
		System.out.println(output);
	}

}
