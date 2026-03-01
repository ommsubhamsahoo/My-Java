package programs;
class Mychar{
	public static void mycharprint()
	{
		String t="";
		for(char i=65;i<=75;i++)
		{
			t=t+i;
			System.out.println(t);
		}
	}
}
public class mypro2 {
public static void main(String[] args) {
	Mychar.mycharprint();
}
}
