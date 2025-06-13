package Practice_Java_Interview_Questions;

public class Count_AllCaps_AllSmall_AllDigits_AllSpecial {
	public static void main(String[] args) {

		String s1 = "MukuLPandey89@gmail.com";
		int s = 0, c = 0, n = 0, ch = 0;
		String small = "", caps = "", digits = "", spcl = "";

		for (int i = 0; i < s1.length(); i++) {
			char a = s1.charAt(i);
			if (Character.isLowerCase(a)) {
				s++;
				small = small + a;
			} else if (Character.isUpperCase(a)) {
				c++;
				caps = caps + a;
			} else if (Character.isDigit(a)) {
				n++;
				digits = digits + a;
			} else {
				ch++;
				spcl = spcl + a;
			}
		}
		System.out.println("Small==>" + s + "==>" + small);
		System.out.println("Capital==>" + c + "==>" + caps);
		System.out.println("Digits==>" + n + "==>" + digits);
		System.out.println("Special Character==>" + ch + "==>" + spcl);

	}

}
