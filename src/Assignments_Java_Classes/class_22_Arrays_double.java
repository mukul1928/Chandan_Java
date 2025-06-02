package Assignments_Java_Classes;

import java.util.Arrays;

public class class_22_Arrays_double 
{
	public static void main(String[] args) 
	{
		double salary[] = new double[5];
		salary[0] = 15000.87;
		salary[1] = 24729.64;
		salary[2] = 53533.65;
		salary[3] = 65893.52;
		salary[4] = 250058.34;
		
		Arrays.sort(salary);
		System.out.println(Arrays.toString(salary));
	}
}
