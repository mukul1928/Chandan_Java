package class_31_Exceptional_Handling_Arrays_FinallyBlock_ThrowsAndThrow;

import java.util.InputMismatchException;

public class ThrowKeyword 
{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,NullPointerException,InputMismatchException
	{
		//throw new NullPointerException();
		//throw new NullPointerException("Hey Element is not holding any values");
		//throw new ArrayIndexOutOfBoundsException();
		throw new InputMismatchException();
	}
}
