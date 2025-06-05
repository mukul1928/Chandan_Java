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
	}
}
