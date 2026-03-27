package MySetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class MyhashSet {
public static <E> void main(String[] args) {
	HashSet<String> hs=new HashSet();
	hs.add("hij");
	hs.add("abc");
	hs.add("klm");
	hs.add("efg");
	hs.add("efg");
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	
	Iterator<String> itr = hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next() );
	}
	
	
	
	
}
}
