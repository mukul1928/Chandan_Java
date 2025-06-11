package class_37_MainMethodOverloadig;

public class MainMethodOverLoading 
{
	public static void main(String[] args) 
	{
		main();
		main(100,745);
	}
	
	public static void main() 
	{
		System.out.println("Main Method without parameters");
	}
	public static void main(int a, int b)
	{
		System.out.println("Main method with int a and int b");
	}
}
