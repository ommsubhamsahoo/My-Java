package MyMultithread;

class MyThread1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("2*"+i+"="+2*i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
class MyThread2 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("3*"+i+"="+3*i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
class MyThread3 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("4*"+i+"="+4*i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
public class MyNum {
	public static void main(String[] args) {
		MyThread1 m1=new MyThread1();
		MyThread2 m2=new MyThread2();
		MyThread3 m3=new MyThread3();
		
		m1.start();
		m2.start();
		m3.start();
	}
	
	
}
