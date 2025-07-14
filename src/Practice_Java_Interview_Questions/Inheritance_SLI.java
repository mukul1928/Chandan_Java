package Practice_Java_Interview_Questions;

class Employee {
	float salary = 100000;
}

class Programmer extends Employee {
	int bonus = 1000;
}

public class Inheritance_SLI {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is " + p.salary);
		System.out.println("Bonus of Programmer is " + p.bonus);
	}
}
