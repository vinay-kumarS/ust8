import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App7 {

	public static void main(String[] args) {
		List<String> countries=Arrays.asList("India","Australia","Pakistan","Sri Lanka","Japan");
		
		countries.stream()
//		.filter((c)->c.length()==5)
//		.sorted()
		.map(c->c.toUpperCase())
		.forEach(System.out::println);
		
	}

}
