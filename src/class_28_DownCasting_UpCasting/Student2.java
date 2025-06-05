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
		
	}
}
