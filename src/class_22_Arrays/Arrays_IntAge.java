package class_22_Arrays;
import java.util.Arrays;
public class Arrays_IntAge 
{
	public static void main(String[] args) 
	{
		int age[] = new int[3];
		age[0] = 90;
		age[1] = 16;
		age[2] = 52;
		age[2] = 104; // this is how you update the value of your any index in Array
		//age[3] = 43; // As the array size is 3 and if I go beyond of the given size I'll get ArrayIndexOutOfBoundsException
		
		/*
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		*/
		
		Arrays.sort(age); //Arrays is a class and sort is one of its methods
		/*
		for(int i=0;i<=2;i++)
		{
			System.out.println(age[i]);
		}
		*/
		System.out.println(Arrays.toString(age));
	}
}
