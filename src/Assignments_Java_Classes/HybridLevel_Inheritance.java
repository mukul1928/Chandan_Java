package Assignments_Java_Classes;
class Parent
{
	void add()
	{
		System.out.println("add");
	}
}
class Parent1 extends Parent
{
	void add1()
	{
		System.out.println("add1");
	}
}
class Parent2 extends Parent
{
	void add2() {
		System.out.println("add2");
	}
}
public class HybridLevel_Inheritance extends Parent2
{
	public static void main(String[] args) 
	{
		HybridLevel_Inheritance h = new HybridLevel_Inheritance();
		h.add();
		h.add2();
		Parent1 p = new Parent1();
		p.add1();
		p.add();
	}
}
