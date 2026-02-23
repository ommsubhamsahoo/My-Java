package mystringpack;

public class MyString8 {
	public static void main(String[] args) {
		String s="Bhubaneswar-is a state-capital-of odisha";
		String[] sh=s.split("-");
		for(String s1:sh)
		{
			System.out.println(s1);
		}
	}  
}
