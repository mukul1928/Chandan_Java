package class_17_ConcreteClassAbstractClass_AbstractMethod;
abstract class ParentClass //exposing this to the third party applications
{
	abstract void add(); // abstract method will always be non-static 
	abstract void substract();
	void mul() //concrete methods
	{
		System.out.println("It is a logic which I am exposing");
	}
	static void modulous() //concrete methods 
	{
		System.out.println("This is the logic which I am exposing modulous");
	}
}
public class ChildClass extends ParentClass
{
	@Override
	void substract()
	{
		System.out.println("Real Logic Substract");
	}
	@Override
	void add() //concrete method 
	{
		System.out.println("Real Logic");
	}
	public static void main(String[] args) //concrete method
	{
		ChildClass c1 = new ChildClass();
		c1.add();
		c1.substract();
		c1.mul();
		modulous();
	}

	
}
