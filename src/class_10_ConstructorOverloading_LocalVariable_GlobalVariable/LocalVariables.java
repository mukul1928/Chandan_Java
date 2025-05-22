package class_10_ConstructorOverloading_LocalVariable_GlobalVariable;

public class LocalVariables 
{
	LocalVariables()
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
		LocalVariables l = new LocalVariables();
		l.substract();
		l.substract(21, "Chandan", 'M');
		
	}
	
}
