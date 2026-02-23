package pattern;

public class Pattern4 {
	public static void main(String[] args) {
		for (int r = 1; r <= 5; r++) {
			for(int s=5;s>=r;s--)
			{
				System.out.print(" ");
			}
			
			
			for(int st=1;st<=r;st++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

