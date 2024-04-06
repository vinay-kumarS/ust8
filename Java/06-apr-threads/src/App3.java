class First extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("First");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Second extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Second");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Third extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Third");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class App3 {

	public static void main(String[] args) throws InterruptedException {
		First t1=new First();
		Second t2=new Second();
		Third t3=new Third();
		
		t1.start();
		t2.start();
		t2.join(); //whoever have already started, can continue. but others wait
		t3.start();
		
	}

}
