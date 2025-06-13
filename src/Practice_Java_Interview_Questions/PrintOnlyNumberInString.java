package Practice_Java_Interview_Questions;

public class PrintOnlyNumberInString {

	public static void main(String[] args) {

		String s = "hello123hai";
		String s2 = "";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c >= '0' && c <= '9') {
				s2 = s2 + c;
			}

		}
		System.out.println(s2);

	}

}
