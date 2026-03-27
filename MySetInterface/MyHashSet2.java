package MySetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}

}

public class MyHashSet2 {
	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet();
		hs.add(new Student("chinu"));
		hs.add(new Student("subham"));
		hs.add(new Student("Nabin"));
		hs.add(new Student("Bishnu"));
		hs.add(new Student("Aman"));
		System.out.println(hs);

		System.out.println();

		LinkedHashSet<Student> ls = new LinkedHashSet();
		ls.add(new Student("chinu"));
		ls.add(new Student("subham"));
		ls.add(new Student("Nabin"));
		ls.add(new Student("Bishnu"));
		ls.add(new Student("Aman"));
		System.out.println(ls);

		/*
		 * TreeSet<Student> ts = new TreeSet(); ts.add(new Student("chinu")); ts.add(new
		 * Student("subham")); ts.add(new Student("Nabin")); ts.add(new
		 * Student("Bishnu")); ts.add(new Student("Aman")); System.out.println(ts);
		 */

	}
}
