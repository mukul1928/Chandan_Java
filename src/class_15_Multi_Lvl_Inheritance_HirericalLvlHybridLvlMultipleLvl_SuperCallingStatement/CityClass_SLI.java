package class_15_Multi_Lvl_Inheritance_HirericalLvlHybridLvlMultipleLvl_SuperCallingStatement;

public class CityClass_SLI extends StateClass 
{
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}
	public static void main(String[] args) 
	{
		add();
		CityClass_SLI c = new CityClass_SLI();
		c.sub();
		c.mul();
		c.div();
	}
}
