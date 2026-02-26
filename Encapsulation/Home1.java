package Encapsulation;

class Fan
{
	 private int speed;
	 public Fan(int speed) {
		if(speed<=5)
		{
			this.speed=speed;
			System.out.println("speed is:"+this.speed);
		}
		else
		{
			System.out.println("speed is maximum.");
		}
		
	}
	 
//	public int getSpeed() {
//		return speed;
//	}
//
//	 public void setSpeed(int speed) {
//		 if(speed<=5)
//		 {
//		 this.speed = speed;
//		 }
//		 else
//		 {
//			 System.out.println("speed can;t be greater than 5");
//		 }
//	 }

	public void speeding()
	{
		System.out.println("Fan is running");
	}
}

public class Home1 {
public static void main(String[] args) {
	Fan f = new Fan(5);
//	f.setSpeed(5);
//	System.out.println(f.getSpeed());
}
}
