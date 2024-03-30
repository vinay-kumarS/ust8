import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("1: Chair\r\n"
				+ "2: Bookshelf\r\n"
				+ "3: Exit");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		Furniture f=null;
		switch(choice)
		{
		case 1:	//Chair
			f=new Chair();
			break;
		case 2:	//BookShelf
			f=new BookShelf();
			break;
		case 3:
			System.exit(0);
		}
		
		f.acceptDetails();
		f.displayDetails();
	}

}
