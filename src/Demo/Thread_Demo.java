package Demo;

import java.util.Iterator;

public class Thread_Demo extends Thread    //thread1
{
	public void run()
	{
		for(int i=0; i<=3; i++)
		{
			System.out.println("I am Thread1");
		}
	}
	public static void main(String[] args)   //thread2 
	{
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		Thread_Demo r= new Thread_Demo();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<=3;i++)
		{
			System.out.println("I am Main Thread");
		}
	}

}
