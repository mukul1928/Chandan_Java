package class_32_SwitchCase_ThreadSleep_MathClass_AssertKeyword;

public class Thread_Sleep_Program 
{
	public static void main(String[] args) throws InterruptedException 
	{
		for(int i = 1;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(4000);
		}
	}
}
