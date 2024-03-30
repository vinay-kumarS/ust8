
public abstract class Shape {
	private String name;
	
	public Shape() {}

	@Override
	public String toString() {
		return "Shape [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape(String name) {
		super();
		this.name = name;
	}
	public abstract void calculateArea();
//	{
//		//what will be the formula for area of a Shape??????
//	}
}
