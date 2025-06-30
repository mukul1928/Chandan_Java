package Practice_Java_Interview_Questions;

public class EmployeeConstructorWithTwoParameter {
	int empId;
	String empName;

	// Parameterized Constructors with two parameters
	EmployeeConstructorWithTwoParameter(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

	void info() {
		System.out.println("Id: " + empId + " Name: " + empName);
	}

	public static void main(String[] args) {
		EmployeeConstructorWithTwoParameter obj1 = new EmployeeConstructorWithTwoParameter(10245, "Chaitanya");
		EmployeeConstructorWithTwoParameter obj2 = new EmployeeConstructorWithTwoParameter(92354, "Smita Pandey");
		obj1.info();
		obj2.info();
	}

}
