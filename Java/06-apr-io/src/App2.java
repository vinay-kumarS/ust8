import java.io.File;

public class App2 {

	public static void main(String[] args) {
		File f=new File("venkata.txt");
		System.out.println(f.length());
		System.out.print(f.getAbsolutePath());
		System.out.println();
	}

}
