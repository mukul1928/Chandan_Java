package class_08_Nested_If_Else_ConditionalStatements_LogicalOperators_And_Or_Not;

public class Calling_NonStaticMethod_InsideMainMethod {
	
	void add()
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		System.out.println("Started");
		Calling_NonStaticMethod_InsideMainMethod s = new Calling_NonStaticMethod_InsideMainMethod();// This is how we create an object
		s.add();//Calling non static method inside main method
		s.sub();
	}
	void sub()
	{
		int c = 4423;
		int d = 3433;
		System.out.println(c-d);
	}
}
