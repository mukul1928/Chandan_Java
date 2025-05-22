package class_10_ConstructorOverloading_LocalVariable_GlobalVariable;

public class LocalVariable 
{
	//in java we have 4 things
	/*
	 * declaration (int a;)
	 * initialization (a=100;)
	 * utilization (means using that variable somewhere)
	 * implementation (whatever we do inside the method is called implementation)
	 */
	
	void add() 
	{
		int number = 100;// Local Variables
	}
	static void substract()
	{
		double pi; // declaration 
		pi = 100; // initialization
		System.out.println(pi);
	}
	

	public static void main(String[] args) 
	{
		int a = 200;// Local Variable
	}

}
