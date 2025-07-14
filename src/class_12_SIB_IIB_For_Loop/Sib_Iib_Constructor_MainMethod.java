package class_12_SIB_IIB_For_Loop;

public class Sib_Iib_Constructor_MainMethod 
{
	static // This is the SIB
	{
		System.out.println("SIB");
	}
	Sib_Iib_Constructor_MainMethod()
	{
		System.out.println("Constructor");
	}
	{ // This block is called the IIB the opening and the closing of this block
		System.out.println("IIB");
	}
	public static void main(String[] args) // This is the main method 
	{
		System.out.println("Main Method");
		new Sib_Iib_Constructor_MainMethod();
	}
}
