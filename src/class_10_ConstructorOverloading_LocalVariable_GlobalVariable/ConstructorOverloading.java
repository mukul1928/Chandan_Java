package class_10_ConstructorOverloading_LocalVariable_GlobalVariable;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		System.out.println("1st Constructor");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("2nd Constructor with para");
	}
	ConstructorOverloading(int a, int b, int c,double d)
	{
		System.out.println("3rd Constructor with three para");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading();
		new ConstructorOverloading(124);
		new ConstructorOverloading(422,343,666,3.75);
	}

}
