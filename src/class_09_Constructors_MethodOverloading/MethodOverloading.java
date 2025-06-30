package class_09_Constructors_MethodOverloading;
// Compile Time Polymorphism
public class MethodOverloading 
{
	void add()
	{
		System.out.println("Method 1");
	}
	static void add(char c,double b,String d)
	{
		System.out.println("Method 3");
	}
	static void add(int a)
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) 
	{
		MethodOverloading s = new MethodOverloading();
		s.add();
		add(100);//since 2nd method is parameterized so we have to pass the parameter
		add('C',7.67,"Chandan");
	}
}
