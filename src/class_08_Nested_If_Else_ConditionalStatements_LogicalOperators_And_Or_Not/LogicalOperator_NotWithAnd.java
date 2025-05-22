package class_08_Nested_If_Else_ConditionalStatements_LogicalOperators_And_Or_Not;

public class LogicalOperator_NotWithAnd {
	public static void main(String[] args) {
		int age = 19;
		int salary = 10000;
		if(!(age < 20 && salary < 20000))
		{
			System.out.println("Going to execute");
		}
		else
		{
			System.out.println("Not going to execute");
		}
	}

}
