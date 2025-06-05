package class_27_TypeCasting;
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
	}
}
