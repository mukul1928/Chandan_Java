package class_15_Multi_Lvl_Inheritance_HirericalLvlHybridLvlMultipleLvl_SuperCallingStatement;
class SuperCallingParent
{
	SuperCallingParent()
	{
		System.out.println("Parent Constructor");
	}
}
public class SuperCalling extends SuperCallingParent
{
	SuperCalling()
	{
		super();
		System.out.println("SuperCalling statement constructor");
	}
	public static void main(String[] args) 
	{
		new SuperCalling();
	}
}
