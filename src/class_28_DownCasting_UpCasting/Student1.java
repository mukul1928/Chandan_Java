package class_28_DownCasting_UpCasting;
//Case 3: 
//Here Upcasting will be done from Teacher class to Student so teacher will be able to access its own property only not the mentor or the student property
//Upcasting my child class object to the parent class property
class Teacher1
{
	void add()
	{
		System.out.println("add");
	}
}
class Mentor1 extends Teacher1
{
	void sub()
	{
		System.out.println("sub");
	}
}
public class Student1 extends Mentor1
{
	void mul()
	{
		System.out.println("mul");
	}
	public static void main(String[] args) 
	{
		Teacher1 t1 = new Student1(); //Upcasting
		t1.add();
		Student1 s1 = (Student1) t1; // only explicit way this is DownCasting
		/*
		 * Once you have downcasted with the help of its reference variable 
		 * you can access any of the methods from that class till the top of the class methods 
		 * but not the below ones
		 */
		s1.mul();
	}
}
