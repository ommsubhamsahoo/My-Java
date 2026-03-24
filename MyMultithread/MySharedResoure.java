package MyMultithread;
 
class WhiteBoard implements Runnable{

	@Override
	synchronized public void run() {
		String name=Thread.currentThread().getName();
		try {
			System.out.println(name+" trying to access whiteboard");
			
			Thread.sleep(1000);
			System.out.println(name+" got access to whiteboard");
			for(int i=1;i<=5;i++)
			{
				System.out.println(name+" writing on the board");
				Thread.sleep(2000);
				
			}
			System.out.println(name+" completed accessing the board");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class MySharedResoure {
public static void main(String[] args) {
	
	WhiteBoard w = new WhiteBoard();
	
	Thread t1 = new Thread(w);
	Thread t2 = new Thread(w);
	Thread t3 = new Thread(w);
	
	t1.setName("Java");
	t2.setName("Aws");
	t2.setName("Cyber");
	
	t1.setPriority(3);
	t2.setPriority(6);// it does not work because it depends on the thread schedular
	t3.setPriority(10);
	
	t1.start();
	t2.start();
	t3.start();
}
}
