package MyMultithread;

class Test extends Thread{
	@Override
	public void run() {
		String name= Thread.currentThread().getName();
		if(name.equals("printChar"))
		{
			printChar();
		}
		else if(name.equals("printTab"))
		{
			printTab();
		}
		else
		{
			printNum();
		}
		
	}
	
	public void printChar() {
		for (int j = 65; j <= 90; j++) {
			try {
				Thread.sleep(1000);
				System.out.println((char)j);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void printTab() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("2*"+i+"="+(2*i));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	public void printNum() {
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
public class MyMultithread {
public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		t1.setName("printChar");
		t2.setName("printTab");
		t3.setName("printNum");
		
		t1.start();
		t2.start();
		t3.start();
}
}
