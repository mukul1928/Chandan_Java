package class_37_MainMethodOverloadig;

public class MainMethodOverLoading 
{
	void main(double a)
	{
		System.out.println("double value 3.14");
	}
	
	public static void main(String[] args) 
	{
		main();
		main(100,745);
		MainMethodOverLoading m = new MainMethodOverLoading();
		m.main(1.2334343);
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
