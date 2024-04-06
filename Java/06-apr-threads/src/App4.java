class MyThread extends Thread
{
	Counter counter;
	public MyThread(Counter counter)
	{
		this.counter=counter;
	}
	public void run()
	{
		try {
			counter.display();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Counter
{
	public void display() throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" has entered the display method");

		synchronized (this) {
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+": "+i);
				Thread.sleep(1000);
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" has exited the display method");

	}
}

public class App4 {

	public static void main(String[] args) {
		Counter counter1=new Counter();
		Counter counter2=new Counter();
		MyThread t1=new MyThread(counter1);
		t1.setName("Jag");
		MyThread t2=new MyThread(counter1);
		t2.setName("Dinesh");
		
		t1.start();
		t2.start();
		
	}

}
