package MyMultithread;

class Bput implements Runnable{
	String cls1="javaclsroom";
	String cls2="awsclsroom";
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		if(name.equals("JAVATRAINER")){
			javaTrainerAcquired();
		}
		else {
			awsTrainerAcquired();
		}
	}
	public void javaTrainerAcquired() {
		synchronized (cls1) {
			try {
				System.out.println("javatrainer acquired java classroom");
				Thread.sleep(1000);
				
				synchronized (cls2) {
					System.out.println("javatrainer acquired aws classroom");
					Thread.sleep(1000);
					
				}
				
			}catch (Exception e) {
				System.out.println("Some error occured");
			}
			
		}
	}
	public void awsTrainerAcquired() {
		synchronized (cls1) {
			try {
				System.out.println("awstrainer acquired java classroom");
				Thread.sleep(1000);
				
				synchronized (cls2) {
					System.out.println("awstrainer acquired aws classroom");
					Thread.sleep(1000);
					
				}
				
			}catch (Exception e) {
				System.out.println("Some error occured");
			}
			
		}
	}
	
}
public class MyDeadLock {
	public static void main(String[] args) {
		Bput b = new Bput();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		
		t1.setName("JAVATRAINER");
		t2.setName("AWSTRAINER");
		
		t1.start();
		t2.start();
	}
}
