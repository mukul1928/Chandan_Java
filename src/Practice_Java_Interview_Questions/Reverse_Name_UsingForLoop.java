package Practice_Java_Interview_Questions;

public class Reverse_Name_UsingForLoop {
	public static void main(String[] args) {
		String str = "Automation"; // Step 1: Define the String
		char chars[] = str.toCharArray(); // Step 2: Convert String into char array
		// Step 3: Reverse the char array using two-pointer approach
		for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		// Step 4: Convert char array back to String and print
		System.out.println(new String(chars));
	}

}
