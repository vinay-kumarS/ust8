class One implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Two implements Runnable
{

	@Override
	public void run() {
		for(int i=1000;i<1010;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class App {

	public static void main(String[] args) {
		Thread t1=new Thread(new One());
		Thread t2=new Thread(new Two());
		
		t1.start();
		t2.start();
		
	}

}
