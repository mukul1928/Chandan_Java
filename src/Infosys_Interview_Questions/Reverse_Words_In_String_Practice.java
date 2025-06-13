package Infosys_Interview_Questions;

public class Reverse_Words_In_String_Practice {

	public static void main(String[] args) {
		String s = "My Name Is Anthony Gonsolvesh";
		String[] rev = s.split(" ");
		s = "";
		for (int i = rev.length - 1; i >= 0; i--) {
			s = s + rev[i] + " ";
		}
		System.out.println(s);

	}

}
