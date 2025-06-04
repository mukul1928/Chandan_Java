package class_25_Arrays_Average_StringFunctions_AccessSpecifier_ForMethods;

public class CreateArrayLength5_FindAverage 
{
	public static void main(String[] args) 
	{
		int ar[] = new int[5];
			ar[0] = 35;
			ar[1] = 24;
			ar[2] = 47;
			ar[3] = 96;
			ar[4] = 77;
			
			double sumofno = 0;
			
		//	double average = (ar[0]+ar[1]+ar[2]+ar[3]+ar[4])/ar.length; // Hardest way to solve the problems no need to apply this
		//	System.out.println(average);
			
			for(int i = 0; i<4;i++)
			{
				sumofno = sumofno+ar[i];
			}
			System.out.println("The sum of all the no is: "+sumofno);
			
			double average = sumofno/ar.length;
			
			System.out.println("The average of all the no: "+average);
	}
}
