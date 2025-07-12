package class_33_Polymorphism_Encapsulation;
/*
 * super keyword is only used in java in the concept of method overriding to call the parent class implementation 
 * together with the child class implementation.
 * 
 * super keyword has to be used only in the case of non-static context or a non-static methods.
 * 
 * super keyword can be the first line or any line inside the non-static method.
 */ 

public class ComplieTimePolymorphism // Method Overloading
{
	void add()
	{
		System.out.println("Method 1");
	}
	static void add(char c,double b,String d)
	{
		System.out.println("Method 3");
	}
	static void add(int a)
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) 
	{
		add(23);
		add('C',34.34,"Chandan");
		ComplieTimePolymorphism m = new ComplieTimePolymorphism();
		m.add();
	}
}
