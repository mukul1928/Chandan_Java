package Practice_Java_Interview_Questions;

public class PrintNumberOfWords {
	public static void main(String[] args) {

		String s = "welcome to java class today";
		String[] ch = s.split(" ");
		int length = ch.length;
		System.out.println("number of words in String ->" + length);
	}
}
