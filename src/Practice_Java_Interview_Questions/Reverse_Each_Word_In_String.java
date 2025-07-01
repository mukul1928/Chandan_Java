package Practice_Java_Interview_Questions;

public class Reverse_Each_Word_In_String {
	public static void main(String[] args) {
		String s1 = "welcome to java class";
		String s2 = "";

		String[] s3 = s1.split(" ");
		for (String s4 : s3) {
			String s5 = "";
			for (int i = s4.length() - 1; i >= 0; i--) {
				char c = s4.charAt(i);
				s5 = s5 + c;
			}
			s2 = s2 + s5 + " ";
		}
		System.out.println(s2);
	}
}
