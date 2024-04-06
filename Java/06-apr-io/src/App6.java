import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class App6 {

	public static void main(String[] args) throws IOException{
		File f=new File("MyData.dat");
		DataInputStream dis=new DataInputStream(new FileInputStream(f));
		int i=dis.readInt();
//		String str=dis.readLine();
		float f1=dis.readFloat();
		System.out.println(i);
//		System.out.println(str);
		System.out.println(f1);
	}

}
