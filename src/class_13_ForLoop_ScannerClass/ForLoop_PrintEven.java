package class_13_ForLoop_ScannerClass;

public class ForLoop_PrintEven 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=100;i++) 
		{
			if(i%2==0)
			{
				System.out.println("It is Even= "+i);
			}
			else
			{
				System.out.println("It is Odd= "+i);
			}
		}
	}
}
