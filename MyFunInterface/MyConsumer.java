package MyFunInterface;
 
import java.util.function.Consumer;

public class MyConsumer {
public static void main(String[] args) {
	Consumer<String> c=(s)->{
		System.out.println(s.substring(3));
	};c.accept("Rooman");
	
}
}
