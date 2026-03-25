package MyMultithread;

class Producer extends Thread{
	Queue q;
	public Producer(Queue k) {
		q=k;
	}
		public void run() 
		{
			int i=0;
			for(;;)
			{
				q.store(i++);
			}
		}
	
	
}

class Queue{
	int x;
	boolean is_data_present=false;
	synchronized public void store(int j) {
		
		try {
			if(is_data_present==false)
			{
				x=j;
				System.out.println("Producer produced :"+x);
				Thread.sleep(1000);
				is_data_present=true;
				notify();
			}
			else
			{
				wait();
			}
		}
		catch (Exception e) {
			System.out.println("error occured");
		}
			
	}
			
			

	
	synchronized public void retrieve() {
		try {
			if(is_data_present==true) {
				System.out.println("Consumer consumed :"+x);
				Thread.sleep(1000);
				is_data_present=false;
				notify();
			}
			else {
				wait();
			}
			
		} catch (Exception e) {
			System.out.println(" error occurd");

		}
	}
}

class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	public void run()
	{
		for(;;) {
			b.retrieve();
		}
	}
}

public class MyProCon {
public static void main(String[] args) {
	Queue q = new Queue();
	Producer producer = new Producer(q);
	Consumer consumer = new Consumer(q);
	
	producer.start();
	consumer.start();
	
}
}
