package MyFunInterface;

/*class Task1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("2*"+i+"="+(2*i));
		}
	}
	
}*/
public class MyPro {
public static void main(String[] args) {
	Runnable r=()->{
		for(int i=1;i<=10;i++)
		{
			System.out.println("2*"+i+"="+(2*i));
		}
	};
	
	Runnable r1=()->{
		for(int i=1;i<=10;i++)
		{
			System.out.println("3*"+i+"="+(3*i));
		}
	};
	
	Thread th1 = new Thread(r);
	Thread th2 = new Thread(r1);
	th1.start();
	th2.start();  
}
}
