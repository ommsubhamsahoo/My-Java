 package ObjectMethods;

class Student{
	String name;
	int age;
	
	@Override
	public String toString() {
		return "name :"+name+" "+"age :"+age;
	}  
	
}

public class MyMethods {
public static void main(String[] args) {
//	Student s = new Student();
	String s = new String("Rooman");
//	s.name="Krishh";
//	s.age=22;
	System.out.println(s.toString());
}
}
