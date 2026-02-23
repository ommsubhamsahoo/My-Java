package mystringpack;

public class MyImmutable {
	public static void main(String[] args) {
		String s1 = "Rooman";
		System.out.println(s1);//Rooman
		System.out.println(s1.concat("Technoliges")); //RoomanTechnologies
		System.out.println(s1);//Rooman
		
		StringBuffer s2= new Strin gBuffer(s1);
		System.out.println(s2);
		System.out.println(s2.append("Technology"));
		s1=s2.toString() ;
		System.out.println(s1);
	}
}
