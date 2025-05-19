package class_06_DeclareAndInitializeEachDataTypes_Operators_ConditionalStatements;

public class UpdateAnyVariableValue {
	public static void main(String[] args) {
		int number1 = 100;
		System.out.println(number1);
		number1 = 1000;// updating the value of number1 in line no 7
		System.out.println(number1);

		byte a = 0;
		a = 89;// the value of a has been updated here if you are updating the value don't
				// write the data type again 'byte' should not be written again in line no 11
		System.out.println(a);
	}

}
