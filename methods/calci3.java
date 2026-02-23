package methods;



public class calci3 {
 private int add(int x,int y) {
	// TODO Auto-generated method stub
	 int sum=x+y;
	 return sum;
	 
}
 public static void main(String[] args) {
	calci3 c = new calci3();
	int res = c.add(250, 350);
	System.out.println("sum is present in main() :"+res);
}
}
