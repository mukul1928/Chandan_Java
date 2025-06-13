package Practice_Java_Interview_Questions;

public class GetNumberAndPrintItInWords {

	public static void main(String[] args) {
		String s = "Welcome";
		String s1 = "";
		String rev = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c >= 'a' && c <= 'z') {
				char up = Character.toUpperCase(c);
				s1 = s1 + up;
			} else {
				s1 = s1 + c;
			}
		}
		System.out.println(s1);
		char[] ch2 = s1.toCharArray();
		for (int i = ch2.length - 1; i >= 0; i--) {
			char revnum = ch2[i];
			rev = rev + revnum;
		}
		System.out.println(rev);
	}

}
