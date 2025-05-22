package class_09_Constructors_MethodOverloading;

public class ConstructorsCalling 
{
	ConstructorsCalling()
	{
		System.out.println("This is my constructor without parameter");
	}
	public static void main(String[] args) {
		System.out.println("This is my main method");
		ConstructorsCalling n = new ConstructorsCalling();//This is how you invoke a constructor
		new ConstructorsCalling();// 2nd way to create an Object
	}

}
