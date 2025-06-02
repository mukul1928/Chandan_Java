package class_22_Arrays;

public class Arrays_Find34_Is_Present 
{
	public static void main(String[] args) 
	{
		int number[] = new int[4];
		number[0] = 12;
		number[1] = 34;
		number[2] = 43;
		number[3] = 54;
		
		int no_to_check = 34;
		for(int i=0;i<=3;i++)
		{
			if(no_to_check==number[i])
			{
				System.out.println("Hey I found the number");
			}
		}
			//System.out.println("Sorry ! the number 34 is not present in the given Arrays");
	}
}
