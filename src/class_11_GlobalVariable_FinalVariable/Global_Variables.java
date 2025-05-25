package class_11_GlobalVariable_FinalVariable;

public class Global_Variables {
	
	static int number1 = 100;
	static int number2 = 50;
	
	
	static void add()
	{
		int sum = number1+number2;
		System.out.println(sum);
	}
	static void sub()
	{
		int subtract = number1-number2;
		System.out.println(subtract);
	}
	static void mul() 
	{
		int multiply = number1*number2;
		System.out.println(multiply);
	}
	static void div()
	{
		int devide = number1/number2;
		System.out.println(devide);
	}
	static void modu()
	{
		int modulous = number1%number2;
		System.out.println(modulous);
	}
	public static void main(String[] args) 
	{
	
		add();
		sub();
		mul();
		div();
		modu();
		
	}

}
