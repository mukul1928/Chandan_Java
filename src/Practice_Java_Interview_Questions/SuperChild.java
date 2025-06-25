package Practice_Java_Interview_Questions;

class SuperParent 
{
	int a = 10;
}

public class SuperChild extends SuperParent 
{
	int a = 20;

	public void ab() 
	{
		System.out.println(a + " " + super.a);
	}

	public static void main(String[] args) 
	{
		SuperChild s = new SuperChild();
		s.ab();
	}
}
