package ObjectMethods;

import java.util.Objects;

class Employee1{
	int emp_id;
	String emp_name;
	double emp_salary;
	String emp_city;
	@Override
	public String toString() {
		return "Employee1 [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_salary=" + emp_salary + ", emp_city="
				+ emp_city + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(emp_city, emp_id, emp_name, emp_salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(emp_city, other.emp_city) && emp_id == other.emp_id
				&& Objects.equals(emp_name, other.emp_name)
				&& Double.doubleToLongBits(emp_salary) == Double.doubleToLongBits(other.emp_salary);
	}
	
	
	
}

public class Employee {
public static void main(String[] args) {
	Employee1 e = new Employee1();
	e.emp_id=2020;
	e.emp_name="subham";
	e.emp_salary=100000.00;
	e.emp_city="Konark";
	System.out.println(e);
	
	Employee1 e2 = new Employee1();
	e2.emp_id=2020;
	e2.emp_name="subham";
	e2.emp_salary=100000.00;
	e2.emp_city="Konark";
	System.out.println(e);
	System.out.println(e==e2);
	System.out.println(e.equals(e2));
	System.out.println(e.hashCode());
	System.out.println(e2.hashCode());
}
}
