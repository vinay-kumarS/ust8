import java.util.Scanner;

public class BookShelf extends Furniture{
	private int noOfShelves;
	
	public BookShelf() {}

	public BookShelf(int noOfLegs) {
		super();
		this.noOfShelves = noOfLegs;
	}

	public int getNoOfShelves() {
		return noOfShelves;
	}

	public void setNoOfShelves(int noOfShelves) {
		this.noOfShelves = noOfShelves;
	}

	@Override
	public String toString() {
		return "Chair [noOfShelves=" + noOfShelves + "]";
	}
	
	public void acceptDetails()
	{
		super.acceptDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Shelves: ");
		noOfShelves=sc.nextInt();
		
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Number of Shelves: "+noOfShelves);
	}
}
