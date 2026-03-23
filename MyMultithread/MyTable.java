package MyMultithread;


class My2Table implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("2*"+i+"="+2*i);
		}
	}
	
}
class My3Table implements Runnable{

	@Override
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
class My4Table implements Runnable{

	@Override
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
public class MyTable {
public static void main(String[] args) {
	My2Table m1 = new My2Table();
	My3Table m2 = new My3Table();
	My4Table m3 = new My4Table();
	
	Thread th1 = new Thread();
	Thread th2 = new Thread();
	Thread th3 = new Thread();
	
	th1.start();
	th2.start();
	th3.start();
	
}
}
