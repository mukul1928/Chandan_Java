package class_11_GlobalVariable_FinalVariable;

public class Global_Variable 
{
	static int age;
	static double salary=9087.87;
	char gender = 'M';// Declaration and Initialization
	void add()
	{
		int age = 21;
		System.out.println(age);
	}
	static void subtract()
	{
		age = 90;
		System.out.println(age);
		System.out.println(salary);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(age);
		System.out.println(salary);
		Global_Variable g = new Global_Variable();
		System.out.println(g.gender);
		subtract();
		g.add();
	}
}
