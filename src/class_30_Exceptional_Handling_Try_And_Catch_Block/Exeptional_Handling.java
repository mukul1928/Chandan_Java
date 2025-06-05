package class_30_Exceptional_Handling_Try_And_Catch_Block;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exeptional_Handling {
	public static void main(String[] args) {
		try {
			Scanner s1 = new Scanner(System.in);
			int a = s1.nextInt(); //suppose 1st time i will enter 1
			int c = 1 / a; //suppose 2nd time i will enter 0
			System.out.println(c); //suppose 3rd time i will enter my name chandan
		} catch (ArithmeticException a) {
			System.out.println("hey ! I handled the exception... ! execution continue 1");
		} catch (InputMismatchException e) {
			System.out.println("hey ! I handled the exception... ! execution continue 2");
		}
	}
}
