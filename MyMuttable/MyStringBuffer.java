package MyMuttable;

public class MyStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.append("JAVA"));
		sb.append(" JAVASCRIPT");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" JAMESGOSLING");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
	}
}
