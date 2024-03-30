import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App8 {

	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(10, "Raj", "Kumar", "ECE", 10000.0));
		empList.add(new Employee(9, "Siva", "Kumar", "EEE", 20000.0));
		empList.add(new Employee(11, "Raja", "Siva Kumar", "ECE", 10000.0));
		empList.add(new Employee(5, "Abdul", "Kader", "ECE", 30000.0));
		empList.add(new Employee(4, "Abdul", "Raheem", "EEE", 10000.0));
		empList.add(new Employee(9, "John", "Abraham", "CSE", 30000.0));
		empList.add(new Employee(8, "Dinesh", "Varadarajan", "CSE", 10000.0));
		empList.add(new Employee(12, "Dinesh", "Srinivasan", "IT", 30000.0));
		empList.add(new Employee(7, "Suresh", "Peters", "IT", 10000.0));
		empList.add(new Employee(6, "Suresh", "Kumar", "CSE", 30000.0));
		
		//Display the Departments and the sum of salaries of the employee dept wise
//		Map<String, Long> map = empList.stream()
//		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//		
		Map<String, Double> map = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		for(Entry<String, Double> entry: map.entrySet())
			System.out.println(entry.getKey()+"\t"+entry.getValue());
	}

}
