package Assignments_Java_Classes;

public class class_12_OrderOfExecution_SIB_IIB_MainMethod_Constructor 
{
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new class_12_OrderOfExecution_SIB_IIB_MainMethod_Constructor();
		new class_12_OrderOfExecution_SIB_IIB_MainMethod_Constructor();
	}
	class_12_OrderOfExecution_SIB_IIB_MainMethod_Constructor()
	{
		System.out.println("This is my Constructor");
		
	}
}
