import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App3 {

	public static void main(String[] args) throws IOException {
		//write the code to read all bytes from C:\Users\rjaga\Pictures\paratta.jpg
		File f=new File("C:\\Users\\rjaga\\Pictures\\paratta.jpg");
		int len=(int) f.length();
		byte []data=new byte[len];
		
		//to read bytes from a file, which class i should use?
		FileInputStream fis=new FileInputStream(f);
		fis.read(data);
		//we have read all bytes from the file.
		fis.close();
		//-----------------------
		//lets write these bytes to a new file
		File f2=new File("raja.jpg");
		//to write bytes to a file, which class i should use?
		FileOutputStream fos=new FileOutputStream(f2);
		fos.write(data);
		fos.flush();
		fos.close();
		System.out.println("Check the file at: "+f2.getAbsolutePath());
	}

}
