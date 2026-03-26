package MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList3 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>();
	
	al.add("Chinmaya");
	al.add("Subham");
	al.add("Nabin");
	al.add("Bishnu");
	al.add("Aman");
	System.out.println(al);
	
	System.out.println();
	
	System.out.println("using iteraotr");
	Iterator<String> itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println();
	
	System.out.println("using list iterator");
	ListIterator<String> ltr = al.listIterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	System.out.println();
	System.out.println("reverse order");
	while(ltr.hasPrevious())
	{
		System.out.println(ltr.previous());
	}
}
}
