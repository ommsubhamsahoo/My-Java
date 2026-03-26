package MyList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<>();
	ll.add(10);
	ll.add(20);
	ll.add(30);
	ll.add(40);
	ll.add(50);
	System.out.println(ll);
	ll.add(40);
	ll.add(60);
	ll.add(30);
	System.out.println();
	System.out.println("using for loop");
	for(int i=0;i<ll.size();i++)
	{
		System.out.println(ll.get(i));
	}
	
	System.out.println();
	System.out.println("using for each loop");
	for(Integer i:ll)
	{
		System.out.println(i);
	}
	
	System.out.println();
	System.out.println("using iterator");
	Iterator<Integer> itr = ll.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println();
	System.out.println("using ListIterator");
	ListIterator<Integer> ltr = ll.listIterator();
	while(ltr.hasNext()) {
		System.out.println(ltr.next());
	}
	
	System.out.println();
	System.out.println("reverse order");
	while(ltr.hasPrevious()) {
		System.out.println(ltr.previous());
	}
	
	
	
}
}
