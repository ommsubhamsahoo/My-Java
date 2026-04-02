package MyFunInterface;

import java.util.function.Supplier;

public class MyRandomPass {
public static void main(String[] args) {
	String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$*@!%";
	Supplier<Character> s1= () -> symbols.charAt((int)(Math.random()*symbols.length()));
	Supplier<Integer> s2=() ->(int)(Math.random()*10);
	String pass="";
	
		for(int i=1;i<=8;i++)
		{
			if(i%2==0)
			{
				pass=pass+s1.get();
			}
			else {
				pass+=s2.get();
			}
		}
		System.out.println(pass);
		
}
}
