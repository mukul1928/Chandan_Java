package Top_SDET_InterviewQuestions_And_Answers;

public class ReverseEachWordOfAGivenString {

	public static void main(String[] args) {
		reverseEachWordOfString("Java is a good programming language");
	}

	static void reverseEachWordOfString(String inputString) {
		String[] words = inputString.split(" ");
		String reverseString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String nstr = "";
			char ch;
			for (int j = 0; j < word.length(); j++) {
				ch = word.charAt(j);
				nstr = ch + nstr;
			}
			reverseString = reverseString + nstr + " ";
		}
		System.out.println(inputString);
		System.out.println(reverseString);
	}

}
