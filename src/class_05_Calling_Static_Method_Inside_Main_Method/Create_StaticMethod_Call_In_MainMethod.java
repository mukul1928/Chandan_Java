package class_05_Calling_Static_Method_Inside_Main_Method;

public class Create_StaticMethod_Call_In_MainMethod {
	static void myname() {
		System.out.println("My name is Chandan Pandey");
	}

	public static void main(String[] args) {
		myname();
		System.out.println("Starting of the main method");
		System.out.println("Ending of the main method");
	}

}
