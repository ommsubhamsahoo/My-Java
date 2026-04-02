package MyFunInterface;

import java.util.function.Supplier;

public class MySupplier {
public static void main(String[] args) {
	Supplier<String> s=()->{
		String otp="";
		for(int i=0;i<=6;i++)
		{
			otp+=(int)(Math.random()*10);
		}
		return otp;
	};
	String res=s.get();
	System.out.println(res );
}
}
