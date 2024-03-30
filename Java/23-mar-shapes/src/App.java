
public class App {

	public static void main(String[] args) {
		Shape s=null;
		s=new Circle();
		s.calculateArea();
		
		s=new Triangle();
		s.calculateArea();
		
		s=new Rectangle();
		s.calculateArea();
		
		//for dynamic polymporphism, i need Shape class.
		
		
	}

}
