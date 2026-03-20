package MyMultithread;

class MyTask1 extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

class MyTask2 extends Thread {
	public void run() {
		for (int j = 65; j <= 90; j++) {
			try {
				Thread.sleep(1000);
				System.out.println((char) j);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyTask3 extends Thread{
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

public class MyMainThread1 {

	public static void main(String[] args) {
		MyTask1 t1 = new MyTask1();
		MyTask2 t2 = new MyTask2();
		MyTask3 t3 = new MyTask3();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
