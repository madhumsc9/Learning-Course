package programmsJava;

public class PersonSuperDemo {

	String name, address;
	int age;

	public PersonSuperDemo(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}
}

class Employee extends PersonSuperDemo {
	float salary;

	public Employee(int age, String name, String address, float salary) {
		super(age, name, address);
		this.salary = salary;
	}
}

class TestDemo {
	public static void main(String args[]) {
		Employee e = new Employee(22, "Mukesh", "Delhi", 90000);
		System.out.println("Name: " + e.name + " Salary: " + e.salary + " Age: " + e.age + " Address: " + e.address);
	}
}