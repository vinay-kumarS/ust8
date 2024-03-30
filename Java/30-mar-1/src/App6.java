import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App6 {

	public static void main(String[] args) {
		List<Integer> marks=Arrays.asList(15,25,17,8,90,78,87,68,55);
//		Collections.sort(marks, Collections.reverseOrder());
		Collections.sort(marks, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println(marks);
		
	}

}
