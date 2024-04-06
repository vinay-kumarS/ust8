import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class App5 {

	public static void main(String[] args) throws IOException {
		File f=new File("MyData.dat");
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f));
		dos.writeInt(101);
//		dos.writeChars("Rajkumar");
		dos.writeFloat(10.25f);
		dos.flush();
		System.out.println("Data written into the file");
	}

}
