package MyList;

import java.util.ArrayList;
public class MyArrayList {
	public static void main(String[] args) {
		
		//Arraylist is backed by array.
		//it maintains insertion order(insertion order is preserved)
		//Arraylist is dynamic
		//It allows duplicates
		//it allows heterogeneous data
		//it allows null values
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		al.add(40);
		al.add(50);
		System.out.println(al);
		
		al.add("Rooman");
		System.out.println(al);
		al.add(30);
		al.add(40);
		al.add(null);
		al.add(null);
		
		System.out.println("Iterating over list using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.println("iterating over list using foreach");
		for(Object o:al)
		{
			System.out.println(o );
		}
	}
}
