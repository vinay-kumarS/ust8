import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		File f=new File("venkata.txt");
		f.createNewFile();
		Scanner sc=new Scanner(f);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("The name is "+name);
	}

}
