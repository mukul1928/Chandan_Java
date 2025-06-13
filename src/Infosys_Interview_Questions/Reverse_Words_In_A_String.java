package Infosys_Interview_Questions;
/*
 input:s="the sky is blue"
 output: "blue is sky the"
 */

public class Reverse_Words_In_A_String {

	public static void main(String[] args) {
		String s = "the sky is blue";
		String[] sarr = s.split(" ");
		s = "";
		for (int i = sarr.length - 1; i >= 0; i--) {
			s = s + sarr[i] + " ";
		}
		System.out.println(s);
	}
}
