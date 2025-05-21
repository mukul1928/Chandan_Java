package class_08_Nested_If_Else_ConditionalStatements;

public class Nested_If_Else {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		
		if (a == b) 
		{
			if (a == c) 
			{
				System.out.println("1");
			} 
			else 
			{
				System.out.println("2");
			}
		} 
		else 
		{
			System.out.println("3");
		}
	}

}
