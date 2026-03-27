package MyList;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyArrayList5 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<>(16);
	
	al.add("Omm");
	al.add("subham");
	al.add("sahoo");
	al.add("chinu");
	al.add("Nabin");
	
	ListIterator<String> ltr = al.listIterator(al.size());
	while(ltr.hasPrevious())
	{
		System.out.println(ltr.previous());
	}
}
}
