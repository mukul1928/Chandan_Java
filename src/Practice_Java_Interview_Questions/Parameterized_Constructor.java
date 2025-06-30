package Practice_Java_Interview_Questions;

public class Parameterized_Constructor 
{
	Parameterized_Constructor(int i,int j){
		System.out.println("parameter constructor");
	}
		public static void main(String[] args) 
		{
			new Parameterized_Constructor(10,11);
		}
}
