import java.util.Scanner;

public class Chair extends Furniture{
	private int noOfLegs;
	
	public Chair() {}

	public Chair(int noOfLegs) {
		super();
		this.noOfLegs = noOfLegs;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	@Override
	public String toString() {
		return "Chair [noOfLegs=" + noOfLegs + "]";
	}
	@Override		//by overriding, this method hides the super class method
	public void acceptDetails()
	{
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Legs: ");
		noOfLegs=sc.nextInt();
		
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of legs: "+noOfLegs);
	}
}
