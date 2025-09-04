package Top_SDET_InterviewQuestions_And_Answers;

public class GivesOutput_32412120000_ForTheInput_32400121200 {
	public static void main(String[] args) {
		String input = "32400121200";
		String output = rearrangeDigits(input);
		System.out.println("Output: " + output);
	}

	public static String rearrangeDigits(String input) {
		// Split the input into parts: digits and non-digits
		StringBuilder digits = new StringBuilder();
		StringBuilder nonDigits = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				digits.append(c);
			} else {
				nonDigits.append(c);
			}
		}
		// Concatenate non-digits followed by digits
		return digits.toString() + nonDigits.toString();
	}
}
