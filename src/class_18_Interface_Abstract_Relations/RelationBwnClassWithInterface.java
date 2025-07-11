package class_18_Interface_Abstract_Relations;

//interface is a keyword in java so it can't be written in Capital letter ever

interface One1 //Every method in Interface is by default is public 
{
	void addition(); // abstract method without writing abstract in front of it.. because it is not required inside interface 
	void substraction(); // abstract method without writing abstract in front of it.. because it is not required inside interface 
}

public class RelationBwnClassWithInterface implements One1
{
	void areaofrectangle()
	{
		System.out.println("areaofrectangle");
	}
	static void areaofcircle()
	{
		System.out.println("areaofcircle");
	}
	public static void main(String[] args) 
	{
		RelationBwnClassWithInterface a = new RelationBwnClassWithInterface();
		a.addition();
		a.substraction();
		a.areaofrectangle();
		areaofcircle();
	}
	
	public void addition() 
	{
		System.out.println("The real logic can be here for addition");
	}

	public void substraction() 
	{
		System.out.println("The real logic can be here for substraction");
	}
}
