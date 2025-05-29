package class_17_ConcreteClassAbstractClass_AbstractMethod;
abstract class GrandParent1 //abstract class
{
	abstract void add1();
	abstract void sub1();
	void mul1()
	{
		System.out.println("mul1");
	}
	static void div1()
	{
		System.out.println("div1");
	}
}
abstract class Parent1 extends GrandParent1
{
	abstract void mul();
	abstract void div();
	void modulous()
	{
		System.out.println("modulous");
	}
	void div2()
	{
		System.out.println("div2");
	}
}
public class AbstractChildClass extends Parent1
{
	void mul() 
	{
		System.out.println("mul");
	}
	
	void div() 
	{
		System.out.println("div");
	}
	
	void add1() 
	{
		System.out.println("add1");
	}
	
	void sub1() 
	{
		System.out.println("sub1");
	}
	void sub()
	{
		System.out.println("sub");
	}
	static void add() 
	{
		System.out.println("add");
	}
	public static void main(String[] args) 
	{
		AbstractChildClass c = new AbstractChildClass();
		div1();
		c.add1();
		c.div();
		c.div2();
		c.modulous();
		c.mul();
		c.mul1();
		add();
		c.sub();
		c.sub1();
	}
	
}
