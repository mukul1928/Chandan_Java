package class_18_Interface_Abstract_Relations;
interface ParentOne
{
	void auth();
	void authentication();
}
interface ParentTwo
{
	void username();
	void password();
}
//Multiple Level Inheritance

public class Child_Class implements ParentOne,ParentTwo
{
	public static void main(String[] args) 
	{
		Child_Class c = new Child_Class();
		c.auth();
		c.authentication();
		c.username();
		c.password();
	}
	
	public void username() 
	{
		System.out.println("username");
	}
	
	public void password() 
	{
		System.out.println("password");
	}
	
	public void auth() 
	{
		System.out.println("auth");
	}

	public void authentication() 
	{
		System.out.println("authentication");
	}
}
