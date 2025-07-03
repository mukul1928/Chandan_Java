package Infosys_Interview_Questions;

//input is = abcd and output is = aabbccdd

public class RepeatCharacters {
	public static void main(String[] args) {
		String input = "abcd";
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			output.append(ch).append(ch); // Append the character twice
		}
		System.out.println("Output is: " + output.toString());
	}
}
