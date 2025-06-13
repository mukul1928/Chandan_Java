package Infosys_Interview_Questions;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s = "welcome to java class";
		String[] rev = s.split(" ");
		s = "";
		for (int i = rev.length - 1; i >= 0; i--) {
			s = s + rev[i] + " ";
		}
		System.out.println(s);
	}

}
