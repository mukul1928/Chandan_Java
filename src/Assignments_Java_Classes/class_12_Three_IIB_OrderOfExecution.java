package Assignments_Java_Classes;

public class class_12_Three_IIB_OrderOfExecution 
{
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}
	public static void main(String[] args) 
	{
		new class_12_Three_IIB_OrderOfExecution(); 
		new class_12_Three_IIB_OrderOfExecution(); 
	}
}
