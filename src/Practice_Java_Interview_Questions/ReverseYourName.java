package Practice_Java_Interview_Questions;

public class ReverseYourName 
{
	public static void main(String[] args) 
	{
		String name = "chandan smita pandey";
		String rev = "";
		/*char ch;
		for(int i=0;i<name.length();i++)
		{
			ch = name.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);*/
		
		//============ Second way to reverse your name=======//
		
		for(int i=name.length()-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
	}
}
