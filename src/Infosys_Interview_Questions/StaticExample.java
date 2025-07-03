package Infosys_Interview_Questions;

public class StaticExample 
{
	static int count = 0;
	
	StaticExample()
	{
		count++;
	}
	public static void main(String[] args) {
		StaticExample obj1 = new StaticExample();
		StaticExample obj2 = new StaticExample();
		StaticExample obj3 = new StaticExample();
		System.out.println("Count is: "+ count);
	}
}
