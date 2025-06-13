package Practice_Java_Interview_Questions;

public class PrintNumberOfCharacter {
	public static void main(String[] args) {

		String s = "welcome@123";
		char[] c = s.toCharArray();
		int length = c.length;

		System.out.println("number of characters in string -" + length);
	}
}
