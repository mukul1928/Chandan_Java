package Practice_Java_Interview_Questions;

public class Arrays_Asscending 
{
	static int l;

	public static void sort(int[] a) 
	{
		int t = 0;
		for (int i = 0; i < 1; i++) 
		{
			for (int j = i; j < 1; j++) 
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int a[] = new int[] { -2, 0, 1, 3, -1, 2 };
		l = a.length;
		sort(a);
		for (int i = 0; i < l; i++) 
		{
			System.out.println(a[i] + " ");
		}
	}
}
