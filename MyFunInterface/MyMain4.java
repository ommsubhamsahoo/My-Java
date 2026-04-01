package MyFunInterface;
interface Square{
	int sqr(int a);
}
public class MyMain4 {
public static void main(String[] args) {
	Square c=a->a*a;
	int res=c.sqr(10);
	System.out.println(res);
}
}
