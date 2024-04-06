import java.io.IOException;

public class Bank {
	public void withdraw(int amount) throws IOException
	{
		if(amount>30000)
		{
//			throw new NumberFormatException("Amount cannot be > 30k");			
			throw new IOException("Amount is invalid");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
