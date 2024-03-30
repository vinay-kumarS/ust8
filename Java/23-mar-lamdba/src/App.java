import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class IntegerReverseComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList();
		marks.add(90);
		marks.add(60);
		marks.add(94);
		marks.add(54);
		marks.add(45);
		marks.add(76);
		marks.add(56);
		marks.add(69);
		marks.add(96);
		marks.add(89);
		marks.add(91);
		marks.add(78);
		marks.add(34);
		marks.add(45);
		
//		Collections.sort(marks, new IntegerReverseComparator());
		Collections.sort(marks, (o1,o2)->o2.compareTo(o1));
		
		System.out.println(marks);
	}

}
