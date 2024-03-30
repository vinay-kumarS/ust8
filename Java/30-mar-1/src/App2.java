import java.util.Set;
import java.util.TreeSet;

public class App2 {

	public static void main(String[] args) {
		Set<Integer> marks=new TreeSet<>();	//while adding elements itself it maintains sorted manner
		marks.add(50);
		marks.add(150);
		marks.add(510);
		marks.add(501);
		marks.add(45);
		marks.add(54);
		marks.add(80);
		marks.add(70);
		marks.add(90);
		marks.add(10);
		
//		Collections.sort(marks);	 ///ERROR! 	Set cannot be sorted
		
		System.out.println(marks);
	}

}
