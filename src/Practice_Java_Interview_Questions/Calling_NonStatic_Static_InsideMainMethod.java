package Practice_Java_Interview_Questions;

public class Calling_NonStatic_Static_InsideMainMethod {
	void add()
	{
		System.out.println("Calling non static method");
	}
	static void sub()
	{
		System.out.println("Calling static method");
	}
	
	
	public static void main(String[] args) {
			
		Calling_NonStatic_Static_InsideMainMethod c= new Calling_NonStatic_Static_InsideMainMethod();
		c.add();
		sub();
		
		}
}
