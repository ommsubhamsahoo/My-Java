package MyMultithread;

class MyDemo extends Thread{
	public void run() {
		for(;;)
		{
			try {
				Thread.sleep(1000);
				System.out.println("User thread");
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class MyUser {
public static void main(String[] args) {
	System.out.println("main thread started");
	MyDemo d1 = new MyDemo();
	d1.start();
	System.out.println("main thread ended");
}
}
