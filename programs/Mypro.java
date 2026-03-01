package programs;
	class Myprint{
		public static void print() {
			System.out.println("printing alphabet uppercase");
			for(int i=65;i<=90;i++)
			{
				System.out.println((char)(i+32));
			}
			System.out.println("printing alphabet lowercase");
			for(int j=97;j<=122;j++)
			{
				System.out.println((char)(j-32));
			}
		}
	}																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
public class Mypro {
public static void main(String[] args) {
	Myprint.print(); 
}
}



