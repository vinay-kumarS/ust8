import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		List<Integer> marks=new ArrayList<>();
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

//		System.out.println(marks.get(1));
		
//		Collections.sort(marks);
		
//		System.out.println(marks);
		ListIterator<Integer> it = marks.listIterator(marks.size());
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		System.out.println(".............");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}

}
