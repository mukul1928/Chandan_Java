package Top_SDET_InterviewQuestions_And_Answers;

import java.util.Objects;

//Java Program To Implement HashCode And Equals
public class Student {
	private int id;
	private String name;

	// Constructor
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// Getters and setters (omitted for brevity)
	// hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	// equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		return id == student.id && Objects.equals(name, student.name);
	}

	public static void main(String[] args) { // Creating objects of Student class
		Student student1 = new Student(1, "Alice");
		Student student2 = new Student(2, "Bob");
		Student student3 = new Student(1, "Alice");
		// Testing equals method
		System.out.println("student1.equals(student2): " + student1.equals(student2)); // Output: false
		System.out.println("student1.equals(student3): " + student1.equals(student3)); // Output: true
		// Testing hashCode method
		System.out.println("Hashcode of student1: " + student1.hashCode());
		System.out.println("Hashcode of student2: " + student2.hashCode());
		System.out.println("Hashcode of student3: " + student3.hashCode());
	}
}
