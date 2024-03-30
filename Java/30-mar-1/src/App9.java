import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class App9 {

	public static void main(String[] args) {
		Employee employee=new Employee();
		Method[] methods = employee.getClass().getMethods();
		for(Method m:methods)
		{
			System.out.println(m.getName());
			for(Annotation x:m.getAnnotations())
			{
				System.out.println("\t"+x);
			}
		}
		
//		Annotation[] annotations = employee.getClass().getAnnotations();
//		for(Annotation a:annotations)
//			System.out.println(a);
	}
 
}
