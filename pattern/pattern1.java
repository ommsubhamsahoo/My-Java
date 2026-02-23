package pattern;

public class pattern1 {
	public static void main(String[] args) {
//		System.out.println("*");
		/*
		 * for(int r=1;r<=5;r++) { for (int i = 1; i <=5; i++) { System.out.print("*");
		 * } System.out.println(); }
		 */
		for(int r=1;r<=5;r++) {
		for (int i = 1; i <=5; i++) {
			System.out.print("*");
		}
		for (int j = 1; j <=5; j++) { 
			System.out.print("$");
		}
		System.out.println();
		} 
	}
}
