package class_18_Interface_Abstract_Relations;
interface Parent03
{
	void multiply();
	void division();
}
abstract class Parent01 implements Parent03
{
	abstract void mul();
	abstract void div();
	void username() 
	{
		System.out.println("username");
	}
	void password() 
	{
		System.out.println("password");
	}
}
abstract class Parent02 extends Parent01
{
	abstract void add1();
	abstract void sub1();
}
public class ChildClasss extends Parent02
{
 static void add() 
 {
	 System.out.println("add");
 }
 void sub()
 {
	 System.out.println("sub");
 }
 	public static void main(String[] args) 
 	{
 		System.out.println("Main Method");
 		ChildClasss c = new ChildClasss();
 		c.multiply();
 		c.division();
 		c.mul();
 		c.div();
 		c.username();
 		c.password();
 		c.add1();
 		c.sub1();
 		add();
 		c.sub();
 	}
	
	public void multiply() 
	{
		System.out.println("multiply");
	}
	
	public void division() 
	{
		System.out.println("division");
	}
	
	void add1() 
	{
		System.out.println("add1");
	}
	
	void sub1() 
	{
		System.out.println("sub1");
	}
	
	void mul() 
	{
		System.out.println("mul");
	}
	
	void div() 
	{
		System.out.println("div");
	}
}
