import java.util.Scanner;

public class Furniture {
	private String name;
	private String color;
	
	public Furniture() {}

	public Furniture(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Furniture [name=" + name + ", color=" + color + "]";
	}
	
	public void acceptDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the furniture:");
		name=sc.nextLine();
		System.out.println("Enter the color of the furniture:");
		color=sc.nextLine();
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Color: "+color);
	}
}
