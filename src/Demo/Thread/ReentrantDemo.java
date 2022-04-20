package Demo.Thread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReentrantLock r = new ReentrantLock();
		r.lock();
		
		r.unlock();
		System.out.println(r.isLocked());
		r.lock();
		r.lock();
		r.lock();
		r.lock();
		r.lock();

		System.out.println(r.isHeldByCurrentThread());
		
		System.out.println(r.getQueueLength());
		
		System.out.println(r.getHoldCount());
	}

}
