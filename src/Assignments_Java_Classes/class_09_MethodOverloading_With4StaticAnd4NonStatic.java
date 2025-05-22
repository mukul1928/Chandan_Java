package Assignments_Java_Classes;

public class class_09_MethodOverloading_With4StaticAnd4NonStatic 
{
	static void add()
	{
		System.out.println("Method 1");
	}
	static void add(int a)
	{
		System.out.println("Method 2");
	}
	static void add(double b)
	{
		System.out.println("Method 3");
	}
	static void add(char c)
	{
		System.out.println("Method 4");
	}
	public static void main(String[] args) 
	{
		add();
		add(128);
		add(4.65);
		add('M');
		class_09_MethodOverloading_With4StaticAnd4NonStatic c = new class_09_MethodOverloading_With4StaticAnd4NonStatic();
		c.add("Chandan");
		c.add(false);
		c.add(4343f);
		c.add(255, 'C');
	}
	void add(String d)
	{
		System.out.println("Method 5");
	}
	void add(boolean e)
	{
		System.out.println("Mehtod 6");
	}
	void add(float f)
	{
		System.out.println("Method 7");
	}
	void add(int g, char h)
	{
		System.out.println("Method 8");
	}

}
