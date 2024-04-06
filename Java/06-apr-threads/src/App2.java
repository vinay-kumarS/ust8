class Even extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Even");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}

class Odd extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Odd");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
public class App2 {

	public static void main(String[] args) {
		Even t1=new Even();
		Odd t2=new Odd();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
	}

}
