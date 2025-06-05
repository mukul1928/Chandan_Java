package class_27_TypeCasting_DownCasting;
//Case 1:
//Converting child class object into super class type is called the TypeCasting
class Parent_Class
{
	void add()
	{
		System.out.println("Add");
	}
	
}
public class Student_Class extends Parent_Class
{
	void sub()
	{
		System.out.println("Sub");
	}
	
	public static void main(String[] args) 
	{
		Parent_Class p1 = new Student_Class(); // UpCasting
		p1.add();// I can only access the Parent class property not the child class property 
		Student_Class s1 = (Student_Class) p1; //only explicit way this is DownCasting 
		/*
		 * Once you have downcasted with the help of its reference variable 
		 * you can access any of the methods from that class till the top of the class methods 
		 * but not the below ones
		 */
		s1.sub();
	}
}
