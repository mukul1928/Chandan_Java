package class_25_Arrays_Average_StringFunctions_AccessSpecifier_ForMethods;

public class AccessSpecifierWithingClass 
{
	public static void add()
	{
		System.out.println("add");
	}
	protected static void sub()
	{
		System.out.println("sub");
	}
	private void multiply()
	{
		System.out.println("multiply");
	}
	void devide() //default or package access specifier
	{
		System.out.println("devide");
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();
		AccessSpecifierWithingClass a = new AccessSpecifierWithingClass();
		a.devide();
		a.multiply();
	}
}
