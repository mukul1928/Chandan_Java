package class_14_Inheritance_In_Java_ScannerClass;

//Single Level Inheritance

class ParentClass
{
	void mul(int a, int b)
	{
		System.out.println(a*b);
	}
	void div(int a, int b)
	{
		System.out.println(a/b);
	}
}
public class ChildClass_SLI extends ParentClass
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		ChildClass_SLI c = new ChildClass_SLI();
		c.add(23,32);
		c.sub(98,45);
		c.mul(65,89);
		c.div(123666,66);
	}
}
