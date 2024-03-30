import java.text.SimpleDateFormat;
import java.util.Date;

public class App5 {
	public static void main(String[] args) {
		Date dt=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
		System.out.println(sdf.format(dt));
	}
}
