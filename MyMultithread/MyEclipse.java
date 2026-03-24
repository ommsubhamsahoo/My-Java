package MyMultithread;


class MyTyping extends Thread{ //FOREGROUND ACTIVITY
	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			
			try {
				Thread.sleep(1000);System.out.println("Main activity typing  :"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class AutoSave extends Thread{ //BACKGROUND ACTIVITY
	public void run() {
		for(;;) {
			
			try {
				Thread.sleep(1000);
				System.out.println("Autosave Daemon thread.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class AutoCompletion extends Thread{ //BACKGROUND ACTIVITY
	public void run() {
		for(;;) {
			
			try {
				Thread.sleep(1000);
				System.out.println("AutoCompletion Daemon thread.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class MyEclipse {
 public static void main(String[] args) {
	MyTyping t = new MyTyping();
	AutoCompletion a1 = new AutoCompletion();
	AutoSave a2 = new AutoSave();
	a1.setDaemon(true);
	a2.setDaemon(true);
	
	t.start();
	a1.start();
	a2.start();
}
}
