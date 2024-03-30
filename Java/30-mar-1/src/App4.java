import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class App4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		
		for(Character c : input.toCharArray())
		{
			//check if c is already found in the map as a key or not
			Integer count=map.getOrDefault(c, 0);
//			if(count==null)
//			{
//				count=0;
//			}
			count++;
			map.put(c, count);			
		}
		
		//how to iterate a map. Map does not have iterator. Several ways to iterate a map
		
		//method 1
		
//		Set<Character> keys = map.keySet();
//		Iterator<Character> it = keys.iterator();
//		while(it.hasNext())
//		{
//			Character key = it.next();
//			System.out.println(key+" : "+map.get(key));
//		}
		
		
		//method 2:
		
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+ "\t" +entry.getValue());
		}
		
	
		
		
	}

}
