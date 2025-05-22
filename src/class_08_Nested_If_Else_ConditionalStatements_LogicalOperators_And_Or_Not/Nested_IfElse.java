package class_08_Nested_If_Else_ConditionalStatements_LogicalOperators_And_Or_Not;

public class Nested_IfElse {
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		String gender1 = "Male";
		String gender2 = "Female";
		String gender3 = "Custom";
		
		if (c > b) 
		{
			if (a > b) 
			{
				if(gender1=="Custom")
				{
					if(gender2=="Female") 
					{
						if(gender3=="Custom")
						{
							System.out.println("8");
						}
						else
						{
							System.out.println("9");
						}
						System.out.println("6");
					}
					else
					{
						System.out.println("7");
					}
					System.out.println("4");
				}
				else
				{
					System.out.println("5");
				}
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
