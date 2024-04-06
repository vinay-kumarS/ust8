import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App4 {

	public static void main(String[] args) throws IOException, InterruptedException {
		//write the code to read all bytes from C:\Users\rjaga\Pictures\paratta.jpg
		File f=new File("C:\\Users\\rjaga\\Pictures\\briyani1.jfif");
		File f2=new File("chandra.jfif");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(f2);
		int data=-1;
		while((data=fis.read())!=-1)
		{
			fos.write(data);
			fos.flush();
			Thread.sleep(10);
		}
		System.out.println("Done");
	}

}
