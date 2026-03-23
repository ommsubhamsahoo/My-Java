package MyMultithread;

class MyTaskChar extends Thread implements Runnable {

	@Override
	public void run() {
		for (char c = 65; c <= 75; c++) {

			try {
				System.out.println(c);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyTaskNum extends Thread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {

			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class MyTaskMultiply extends Thread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {

			try {
				System.out.println("2*" + i + "=" + 2 * i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class MyRunnable {
	public static void main(String[] args) {
		MyTaskChar m1 = new MyTaskChar();
		MyTaskNum m2 = new MyTaskNum();
		MyTaskMultiply m3 = new MyTaskMultiply();

		/*
		 * Thread th1 = new Thread(m1); Thread th2 = new Thread(m2); Thread th3 = new
		 * Thread(m3);
		 */

//	th1.start();
//	th2.start();
//	th3.start();

		m1.start();
		m2.start();
		m3.start();

	}
}
