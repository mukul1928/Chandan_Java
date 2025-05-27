package class_12_SIB_IIB_For_Loop;

public class Sib_Iib_Constructor_MainMethod 
{
	static 
	{
		System.out.println("SIB");
	}
	Sib_Iib_Constructor_MainMethod()
	{
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new Sib_Iib_Constructor_MainMethod();
	}
}
