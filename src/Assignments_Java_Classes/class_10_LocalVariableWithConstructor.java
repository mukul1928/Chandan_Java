package Assignments_Java_Classes;

public class class_10_LocalVariableWithConstructor 
{
	class_10_LocalVariableWithConstructor()
	{
		int a = 45454;
		int b = 3434;
		System.out.println(a/b);
	}
	static void add()
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
	void substract()
	{
		int a = 200;
		int b = 143;
		System.out.println(a-b);
	}
	void substract(int age,String name,char gender)
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(gender);
	}
	public static void main(String[] args) 
	{
		add();
		class_10_LocalVariableWithConstructor l = new class_10_LocalVariableWithConstructor();
		l.substract();
		l.substract(21, "Chandan", 'M');
	}
}
