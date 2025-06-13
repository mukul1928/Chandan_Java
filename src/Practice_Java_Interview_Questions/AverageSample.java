package Practice_Java_Interview_Questions;

public class AverageSample 
{
	public static void main(String[] args) 
	{
		double sum = 0;
		double average = 0;
		
		for(int i=1;i<=20;i++) 
		{
			
			sum=sum+i;
			average = sum/i;
		}
		System.out.println(sum);
		System.out.println(average);
	}

}
