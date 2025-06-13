package Practice_Java_Interview_Questions;

public class CountNumberOfDigit {
	public static void main(String[] args) {

		int num = 12321;
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		System.out.println("number of digits in the given number=>" + count);
	}

}
