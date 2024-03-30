interface Person
{
	void speak();
	default void walk()
	{
		System.out.println("Person walks");
	}
	
	static void run()
	{
		System.out.println("Person runs");
	}
	
}

class Employee implements Person
{
	public void speak()
	{
		
	}
	
	public void walk()
	{
		System.out.println("Employee walks");
	}
	
	public static void run()
	{
		System.out.println("Employee run");
	}
}
public class App {

	public static void main(String[] args) {
		Employee raja=new Employee();
		raja.walk();
		Employee.run();
	}

}
