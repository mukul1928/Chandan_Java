package class_32_SwitchCase_ThreadSleep_MathClass_AssertKeyword;

public class Math_Class 
{
	public static void main(String[] args) 
	{
		double pi =	Math.PI;
		int r = 7;
		System.out.println(pi*r*r);
		System.out.println(Math.addExact(485, 7485)); //int int
		System.out.println(Math.addExact(748596574, 748548080)); //long long
		System.out.println(Math.subtractExact(2343, 1433)); // int int
		System.out.println(Math.subtractExact(797987979, 675765757)); //long long
		System.out.println(Math.multiplyExact(20, 20)); //int int
		System.out.println(Math.sqrt(100)); //square root
		System.out.println(Math.min(55, 23)); // will print the minimum value between the two
		System.out.println(Math.max(324344242, 33434324)); // will print the maximum value between the two
		
		for(int i = 1;i<100;i++) 
		{
		System.out.println(Math.random());
		}
	}
}
