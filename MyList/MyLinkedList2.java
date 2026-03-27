package MyList;

import java.util.LinkedList;

public class MyLinkedList2 {
public static void main(String[] args) {
	LinkedList<Integer> l1 = new LinkedList<>();
	
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	l1.add(1000);
	l1.add(2000);
//	System.out.println(l1);
	System.out.println();
	LinkedList<Integer> l2 = new LinkedList<>();
	l2.add(1000);
	l2.add(2000);
	l2.add(3000);
//	l1.remove(new Integer(20)); //this is depricated
	l1.remove(Integer.valueOf(20));
	l1.addFirst(5000);
	l1.addLast(10000);
//	System.out.println(l1.getFirst());
//	System.out.println(l1.getLast());
	System.out.println(l1.peekFirst());
	System.out.println(l1.peekLast());
	System.out.println("After peek operation :"+l1);
	System.out.println(l1.pollFirst());
	System.out.println(l1.pollLast());
	System.out.println("After poll operation :"+l1);

//	l1.remove(2);
//	l1.addAll(2, l2); //bulky peration or add all.. 
//	l1.retainAll(l2); //to get common element
	l1.removeAll(l2); //to remove the common element
	System.out.println(l1);
}
}
