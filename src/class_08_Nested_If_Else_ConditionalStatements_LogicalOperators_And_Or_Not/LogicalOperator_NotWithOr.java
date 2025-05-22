package class_08_Nested_If_Else_ConditionalStatements_LogicalOperators_And_Or_Not;

public class LogicalOperator_NotWithOr {
	public static void main(String[] args) {
		int age = 19;
		int salary = 10000;
		if(!(age > 19 || salary > 7000))
		{
			System.out.println("I am going to execute the program");
		}
		else
		{
			System.out.println("I am not going to execute the programs Sorry !");
		}
	}
}
