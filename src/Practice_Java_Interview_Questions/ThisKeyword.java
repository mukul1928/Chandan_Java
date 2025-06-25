package Practice_Java_Interview_Questions;

public class ThisKeyword 
{
	int a = 10;
	public void m1(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		ThisKeyword t = new ThisKeyword();
		t.m1(5);
	}
}
