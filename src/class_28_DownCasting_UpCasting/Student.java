package class_28_DownCasting_UpCasting;
// Case: 2
//UpCasting from Mentor to Student so mentor will be able to access the property of its parent and its own but not the student one
class Teacher
{
	void add()
	{
		System.out.println("addition");
	}
}
class Mentor extends Teacher
{
	void sub()
	{
		System.out.println("substract");
	}
}
public class Student extends Mentor
{
	void mul()
	{
		System.out.println("multiply");
	}
	
	public static void main(String[] args) 
	{
		Mentor m1 = new Student();
		m1.add();
		m1.sub();
		Student s1 = (Student) m1; // only explicit way this is DownCasting
		/*
		 * Once you have downcasted with the help of its reference variable 
		 * you can access any of the methods from that class till the top of the class methods 
		 * but not the below ones
		 */
		s1.mul();
	}
}
