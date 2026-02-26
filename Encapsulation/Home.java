package Encapsulation;

class Tv
{  
	private int volume;
	private int brightness;
	public Tv(int volume,int brightness) {
		if(volume<=50 && brightness<=60)
		{
			this.volume=volume;
			this.brightness=brightness;
			System.out.println(this.brightness);
			System.out.println(this.volume);
		}
		else
		{
			System.out.println("volume & brightness must be lesser than 50 &60");
		}
	} 
	public Tv() { //constructor chaining
		// TODO Auto-generated constructor stub
		this(50,60);
		System.out.println("inside default constructor");
	}
	
//	public int getVolume() {
//		return volume;
//	}
//
//	public void setVolume(int volume) {
//		if(volume<=50)
//		{
//		this.volume = volume;
//		}
//		else
//		{
//			System.out.println("Volume can not be greater than 50");
//		}
//	}
//
//	public int getBrightness() {
//		return brightness;
//	}
//
//	public void setBrightness(int brightness) {
//		if(brightness<=60)
//		{
//		this.brightness = brightness;
//		}
//		else
//		{
//			System.out.println("brightness can't be greater than 60");
//		}
//	}

	public void watchMovie()
	{
		System.out.println("watching movie in tv");
	}
}

public class Home {
	public static void main(String[] args) {
//		Tv t = new Tv(100,100);
//		t.setVolume(50);
//		t.setBrightness(60);
//		System.out.println(t.getVolume());
//		System.out.println(t.getBrightness());
		Tv t = new Tv();
		
	}
}
