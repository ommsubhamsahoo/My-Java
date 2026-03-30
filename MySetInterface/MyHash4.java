package MySetInterface;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public Employee(String name,int age) {
		this.name = name;
		this.age=age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}




	@Override
	public int compareTo(Employee o) {
		
		return this.getName().compareTo(o.getName());
	}
	
}

class AgeComparator implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.age, o2.age);
	}
}

public class MyHash4 {
public static void main(String[] args) {
	AgeComparator ageComparator = new AgeComparator();
	TreeSet<Employee> ths = new TreeSet<>(ageComparator );
	
	
	ths.add(new Employee("Aman",21 ));
	ths.add(new Employee("Bishnu",22));
	ths.add(new Employee("Chinmay",23));
	ths.add(new Employee("Nabin",34));
	ths.add(new Employee("Omm",12));
	
	System.out.println(ths);
	
}
}
