package class_31_Exceptional_Handling_Arrays_FinallyBlock_ThrowsAndThrow;

public class Exceptional_Handling_Arrays 
{
	public static void main(String[] args) 
	{
		
			//Scanner s1 = new Scanner(System.in);
			//int a = s1.nextInt();
		
			int age[] = new int[3];
				age[0] = 12;
				age[1] = 32;
				age[2] = 40;
			
			try 
			{
				age[3] = 34;
			}
			catch(ArrayIndexOutOfBoundsException a1)
			{
				System.out.println("Handled the exception");
			}
				System.out.println("Manish is a teacher");
	}
}
