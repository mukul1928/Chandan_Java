package class_15_Multi_Lvl_Inheritance_HirericalLvlHybridLvlMultipleLvl_SuperCallingStatement;

public class Object_Class_Parent_Class 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Object_Class_Parent_Class o = new Object_Class_Parent_Class();
	//	Object o1= o.clone();
		Object o2 = o.getClass();
		System.out.println(o2);
	}
}
