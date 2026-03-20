package MyMultithread;

public class MyTask {
public static void main(String[] args) {
	//Print 1-10...
	for(int i=1;i<=10;i++)
	{
		try {
			Thread.sleep(2000);
			System.out.println(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	System.out.println("************");
	//print A-Z
	for(int j=65;j<=90;j++) {
		try {
			Thread.sleep(2000);
			System.out.println((char)j);  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	 System.out.println("*************");
	//Print 2 multyply table
	for(int i=1;i<=10;i++) {
		System.out.println("2*"+i+"="+2*i);
	}
}
}


