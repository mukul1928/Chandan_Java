package class_15_Multi_Lvl_Inheritance_HirericalLvlHybridLvlMultipleLvl_SuperCallingStatement;
class SuperParent
{
	void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
	}
}
class Parent extends SuperParent
{
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}
}
public class ChildClass_MultiLvlInheritance extends Parent
{
	void modu()
	{
		System.out.println("modulous");
	}
	public static void main(String[] args) 
	{
		ChildClass_MultiLvlInheritance c = new ChildClass_MultiLvlInheritance();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.modu();
	}
}
