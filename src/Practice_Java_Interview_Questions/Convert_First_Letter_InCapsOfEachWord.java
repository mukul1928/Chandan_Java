package Practice_Java_Interview_Questions;

public class Convert_First_Letter_InCapsOfEachWord {

	public static void main(String[] args) {
		String s1 = "welcome to java class";
		String s2 = "";
		String[] s3 = s1.split(" ");
		for (String s4 : s3) {
			char ch = s4.charAt(0);
			char a = Character.toUpperCase(ch);
			String b = s4.substring(1);
			s2 = s2 + a + b + " ";

		}

		System.out.println(s2);
	}

}
