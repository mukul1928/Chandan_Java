package Practice_Java_Interview_Questions;

public class FibboNacciSeries_ForLoop 
{
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println(a+" ");
		System.out.println(b+" ");
		for(int i = 1; i<=10; i++) {
			int sum = a+b; //sum = 0+1=1 //1+1=2
			a=b; // a become 1
			b=sum; // b is 1 
			System.out.print(sum+" ");
		}
	}
}
