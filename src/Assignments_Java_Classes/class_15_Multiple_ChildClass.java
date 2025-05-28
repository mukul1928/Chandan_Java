package Assignments_Java_Classes;

public class class_15_Multiple_ChildClass extends class_15_Multiple_Parent
{
	void modulous()
	{
		System.out.println("Modulous");
	}
	public static void main(String[] args) 
	{
		class_15_Multiple_ChildClass c = new class_15_Multiple_ChildClass();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.modulous();
	}
}
