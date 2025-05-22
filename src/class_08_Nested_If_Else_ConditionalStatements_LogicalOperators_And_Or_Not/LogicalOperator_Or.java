package class_08_Nested_If_Else_ConditionalStatements_LogicalOperators_And_Or_Not;

public class LogicalOperator_Or {
	public static void main(String[] args) {
		int age = 19;
		char gender = 'M';
		if (age < 18 || gender == 'C') // || <-- Or operator symbol it is called double pipeline
		{
			System.out.println("I am eligible to vote");
		}
		else
		{
			System.out.println("I am not eligible to vote");
		}
	}

}
