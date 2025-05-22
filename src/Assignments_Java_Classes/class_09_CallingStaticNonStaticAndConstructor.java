package Assignments_Java_Classes;

public class class_09_CallingStaticNonStaticAndConstructor 
{
	
	class_09_CallingStaticNonStaticAndConstructor()
	{
		System.out.println("This is my one constructor");
	}
	
	static void add() 
	{
		int a = 4343;
		int b = 3334;
		System.out.println(a+b);
	}
	static void sub() 
	{
		int a = 6444;
		int b = 4444;
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		class_09_CallingStaticNonStaticAndConstructor a = new class_09_CallingStaticNonStaticAndConstructor();
		a.mul();
		a.div();	
	}
	void mul() 
	{
		int a = 676766;
		int b = 343434;
		System.out.println(a*b);
	}
	void div() 
	{
		int a = 454454;
		int b = 386;
		System.out.println(a/b);
	}
}
