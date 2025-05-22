package class_09_Constructors_MethodOverloading;

public class Calling_StaticAnd_NonStatic_InsideMainMethod {
	void add() {
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
	void mul() {
		int a = 43434;
		int b = 34776;
		System.out.println(a*b);
	}
	void div() {
		int a = 434;
		int b = 34;
		System.out.println(a/b);
	}
	void modu() {
		int a = 4366;
		int b = 222;
		System.out.println(a%b);
	}

	public static void main(String[] args) 
	{
			substract();
			Calling_StaticAnd_NonStatic_InsideMainMethod s = new Calling_StaticAnd_NonStatic_InsideMainMethod();
			s.add();
			s.mul();
			s.div();
			s.modu();
	}
	static void substract() {
		int a = 200;
		int b = 100;
		System.out.println(a-b);
	}

}
