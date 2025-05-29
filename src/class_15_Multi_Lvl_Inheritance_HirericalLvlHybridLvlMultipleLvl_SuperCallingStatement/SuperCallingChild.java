package class_15_Multi_Lvl_Inheritance_HirericalLvlHybridLvlMultipleLvl_SuperCallingStatement;
class SuperCallingParent
{
	SuperCallingParent()
	{
		System.out.println("Parent Constructor");
	}
}
public class SuperCallingChild extends SuperCallingParent
{
	SuperCallingChild()
	{
		super(); //super calling statement can be used to call the parent class constructor from the child class constructor
		System.out.println("SuperCalling statement constructor");
	}
	public static void main(String[] args) 
	{
		new SuperCallingChild();
	}
}
