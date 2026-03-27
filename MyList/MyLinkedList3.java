package MyList;

import java.util.LinkedList;

public class MyLinkedList3 {
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
//	ll.getFirst();
//	System.out.println(ll);
//	ll.peekFirst();
//	System.out.println(ll);
		ll.add(1000);
		ll.add(2000);
		ll.add(3000);
		ll.add(4000);
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
			ll.remove(Integer.valueOf(2000));
		}

	}
}
