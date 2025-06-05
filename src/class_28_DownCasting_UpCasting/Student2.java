package class_28_DownCasting_UpCasting;
//Case 4: 
//Child class object to the super class type 

class Teacher2
{
	void add()
	{
		System.out.println("add");
	}
}
class Mentor2 extends Teacher2
{
	void sub()
	{
		System.out.println("sub");
	}
}
class Experience_Student extends Mentor2
{
	void mul()
	{
		System.out.println("mul");
	}
}
public class Student2 extends Experience_Student
{
	void div()
	{
		System.out.println("div");
	}
	public static void main(String[] args) 
	{
		Mentor2 m2 = new Experience_Student();
		m2.add();
		m2.sub();
		Student2 s2 = (Student2) m2; //only explicit way this is DownCasting
		/*
		 * Once you have downcasted with the help of its reference variable 
		 * you can access any of the methods from that class till the top of the class methods 
		 * but not the below ones
		 */
		s2.mul();
		s2.div();
	}
}
