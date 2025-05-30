package Assignments_Java_Classes;

interface ParentOne
{
	void add();
	void sub();
}
interface ParentTwo
{
	void username();
	void password();
}
interface ParentThree
{
	void authentication();
	void autherization();
}
interface ParentFour
{
	void userID();
	void userPwd();
}

public class class_18_MultipleLvlOfInheritance_Implements_4_Parents implements ParentOne,ParentTwo,ParentThree,ParentFour
{
	public static void main(String[] args) 
	{
		System.out.println("This is my main method");
		class_18_MultipleLvlOfInheritance_Implements_4_Parents c = new class_18_MultipleLvlOfInheritance_Implements_4_Parents();
		c.add();
		c.sub();
		c.username();
		c.password();
		c.authentication();
		c.autherization();
		c.userID();
		c.userPwd();
	}

	public void userID() 
	{
		System.out.println("userID");
	}

	public void userPwd() 
	{
		System.out.println("userPwd");
	}

	public void authentication() 
	{
		System.out.println("authentication");
	}

	public void autherization() 
	{
		System.out.println("autherization");
	}

	public void username() 
	{
		System.out.println("username");
	}

	public void password() 
	{
		System.out.println("password");
	}

	public void add() 
	{
		System.out.println("add");
	}

	public void sub() 
	{
		System.out.println("sub");
	}
}
