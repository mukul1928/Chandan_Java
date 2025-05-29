package class_15_Multi_Lvl_Inheritance_HirericalLvlHybridLvlMultipleLvl_SuperCallingStatement;
class G_Parent1
{
	G_Parent1(int a,double b)
	{
		System.out.println("G_Parent Constructor");
	}
}
class Parent1 extends G_Parent1
{
	Parent1(String a)
	{super(100,6.54);//Parameterized super calling statement which has to be written in type- explicitely only in case of parameterized constructor
		System.out.println("Parent_1 Constructor");
	}
}
public class ConstrustorChild extends Parent1
{
	ConstrustorChild()
	{super("Chandan");//Parameterized super calling statement which has to be written in type- explicitely only in case of parameterized constructor
		System.out.println("Constructor Child");
	}
	public static void main(String[] args) 
	{
		new ConstrustorChild();
	}
}
