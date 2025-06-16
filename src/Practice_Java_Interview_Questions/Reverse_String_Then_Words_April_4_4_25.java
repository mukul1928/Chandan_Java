package Practice_Java_Interview_Questions;

public class Reverse_String_Then_Words_April_4_4_25 {

	public static void main(String[] args) {
		String name = "Welcome to the java class";
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) 
		{
			char answer = name.charAt(i);
			reverse = reverse + answer;
		}
			System.out.println(reverse);
			boolean value = name.equals(reverse);
			System.out.println(value);
	}

}
