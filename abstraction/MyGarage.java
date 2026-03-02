package abstraction;
abstract class Bike{
	public abstract void ignite() ;
	
	public abstract void changegear() ;
	
	public abstract void accelerate() ;
	
	public abstract void applybrake();

}

abstract class Superbike extends Bike{
	
}

abstract class Hayabuzza extends Superbike{

	@Override
	public void ignite() {
		System.out.println("Hayabuzza is ignited");		
		
	}

	@Override
	public void changegear() {
System.out.println("Hayabuzza changegear");		
	}

	
}
class Hayabuzza1 extends Hayabuzza{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub 
		
	}

	@Override
	public void applybrake() {
		// TODO Auto-generated method stub
		
	}
	
}
 class Hayabuzza2 extends Hayabuzza{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applybrake() {
		// TODO Auto-generated method stub
		
	}
	
}
public class MyGarage {
public static void main(String[] args) {
	Bike hb = new Hayabuzza1();
	hb.ignite();
	hb.changegear();
	hb.accelerate();
	hb.applybrake();
	hb=new Hayabuzza2();
	hb.ignite();
	hb.changegear();
	hb.accelerate();
	hb.applybrake();
}
}
