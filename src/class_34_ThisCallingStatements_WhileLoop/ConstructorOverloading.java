package class_34_ThisCallingStatements_WhileLoop;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		this(100); // const 2
		System.out.println("Const 1");
	}
	ConstructorOverloading(int a)
	{
		this(43.564);
		System.out.println("Const 2");
	}
	ConstructorOverloading(double b)
	{
		this("Chandan");
		System.out.println("Const 3");
	}
	ConstructorOverloading(String c)
	{
		this(343.34f);
		System.out.println("Const 4");
	}
	ConstructorOverloading(float d)
	{
		System.out.println("Const 5");
	}
	public static void main(String[] args) 
	{
		ConstructorOverloading c = new ConstructorOverloading();
		
	}
}
