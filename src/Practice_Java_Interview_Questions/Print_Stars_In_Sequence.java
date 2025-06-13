package Practice_Java_Interview_Questions;

/*
*****
****
***
**
*
*/

public class Print_Stars_In_Sequence {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
