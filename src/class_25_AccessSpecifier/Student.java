package class_25_AccessSpecifier;

public class Student 
{
	public void Learning_AT()
	{
		System.out.println("Learning Automation testing");
	}
	private void Learning_SQL()//The teacher wouldn't be able to access this private access specifier's method properties within the same package
	{
		System.out.println("Learning SQL");
	}
	protected void Learning_API()
	{
		System.out.println("Learning API testing");
	}
	void Learning_Manual_Testing()
	{
		System.out.println("Learning Manual testing");
	}
	
}
