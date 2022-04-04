package Demo;

class MyThread extends Thread
{
	public void run()
	{
		for (int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException
	{
	MyThread m= new MyThread();
	m.start();
//	m.join();		//join() method which allows one thread to wait until another thread completes its execution
	for(int i=0; i<10; i++) 
		{
		System.out.println("Main Thread");
		}
	}

}
