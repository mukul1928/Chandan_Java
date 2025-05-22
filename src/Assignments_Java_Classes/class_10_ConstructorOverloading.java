package Assignments_Java_Classes;

public class class_10_ConstructorOverloading 
{
	class_10_ConstructorOverloading()
	{
		System.out.println("1");
	}
	class_10_ConstructorOverloading(int a)
	{
		System.out.println("2");
	}
	class_10_ConstructorOverloading(double b)
	{
		System.out.println("3");
	}
	class_10_ConstructorOverloading(char c)
	{
		System.out.println("4");
	}
	class_10_ConstructorOverloading(String d)
	{
		System.out.println("5");
	}
	class_10_ConstructorOverloading(float e)
	{
		System.out.println("6");
	}
	class_10_ConstructorOverloading(boolean f)
	{
		System.out.println("7");
	}
	class_10_ConstructorOverloading(int g, char h)
	{
		System.out.println("8");
	}
	class_10_ConstructorOverloading(String g,char j)
	{
		System.out.println("9");
	}
	class_10_ConstructorOverloading(char k, int l)
	{
		System.out.println("10");
	}
	public static void main(String[] args) 
	{
		new class_10_ConstructorOverloading();
		new class_10_ConstructorOverloading(144);
		new class_10_ConstructorOverloading(3.75);
		new class_10_ConstructorOverloading('C');
		new class_10_ConstructorOverloading("Chandan");
		new class_10_ConstructorOverloading(34334f);
		new class_10_ConstructorOverloading(false);
		new class_10_ConstructorOverloading(132,'M');
		new class_10_ConstructorOverloading("Mukul",'K');
		new class_10_ConstructorOverloading('S',143);
	}
}
