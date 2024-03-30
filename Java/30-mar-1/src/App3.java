import java.util.Map;
import java.util.TreeMap;

public class App3 {

	public static void main(String[] args) {
		Map<Integer, String> countryMap=new TreeMap<>();
		countryMap.put(10, "China");
		countryMap.put(1, "India");
		countryMap.put(5, "Australia");
		countryMap.put(2, "Sri Lanka");
		countryMap.put(4, "England");
		countryMap.put(3, "Kenya");
		countryMap.put(8, "South Africa");
		countryMap.put(7, "Pakistan");
		countryMap.put(10, "Korea");		//what will happen?
		
		System.out.println(countryMap);
		
	}

}
