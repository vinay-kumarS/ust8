import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException  {
		 Bank sbi = new Bank();
		 int i=20;
		 int j=1;
		 int k=i/j;
		 try {
			sbi.withdraw(31000);
		} catch (NumberFormatException e) {
			System.out.println("amount is larger than daily limit");
		}finally
		 {
			System.out.println("This is finally");
		 }
		 System.out.println("Thank you visit again");
	}

}
