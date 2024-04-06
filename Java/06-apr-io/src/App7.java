import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App7 {

	public static void main(String[] args) throws IOException{
		Employee employee=new Employee();
		employee.setId(111);
		employee.setName("Raja siva kumar");
		employee.setSalary(1212121.10f);
		
		File f=new File("employee.dat");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(employee);
		oos.flush();
		oos.close();
	}

}
