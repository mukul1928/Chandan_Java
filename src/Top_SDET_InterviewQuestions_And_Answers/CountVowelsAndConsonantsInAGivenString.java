package Top_SDET_InterviewQuestions_And_Answers;

public class CountVowelsAndConsonantsInAGivenString {
	public static void main(String[] args) {
		String str = "Hello World";
		VowelConsonantCount(str);
	}

	static void VowelConsonantCount(String str) {
		int vowels = 0, consonants = 0;
		str = str.toLowerCase();
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels :" + vowels);
		System.out.println("Consonants :" + consonants);
	}
}
