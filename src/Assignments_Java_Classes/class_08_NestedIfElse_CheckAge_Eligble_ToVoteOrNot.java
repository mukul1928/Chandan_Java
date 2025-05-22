package Assignments_Java_Classes;

public class class_08_NestedIfElse_CheckAge_Eligble_ToVoteOrNot {
	public static void main(String[] args) {
		String Gender = "Female";
		int Age = 18;
		if(Gender=="Male") 
		{
			if(Age<18) 
			{
				System.out.println("Eligible to vote");
			}
			else 
			{
				System.out.println("Not eligible to vote");
			}
		}
		else //For Female
		{
			if(Age>=18) 
			{
				System.out.println("The female is eligible to vote");
			}
			else 
			{
				System.out.println("She is not eligible to vote");
			}
		}
	}

}
