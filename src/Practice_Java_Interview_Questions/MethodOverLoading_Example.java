package Practice_Java_Interview_Questions;

public class MethodOverLoading_Example 
{
	void add()
	{
		System.out.println("Adding Something.......");
	}
	void add(int a,double b, String c)
	{
		System.out.println("Int Double String");
	}
	void add(char d)
	{
		System.out.println("Char C");
	}
	public static void main(String[] args) 
	{
		MethodOverLoading_Example m = new MethodOverLoading_Example();
		m.add();
		m.add(12, 232.444343, "Chandan");
		m.add('C');
	}
}
