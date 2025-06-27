package Practice_Java_Interview_Questions;

public class CountNoOfVowel_InYourName {
	public static void main(String[] args) {
		String name = "chandan pandey";
		String name1 = "";
		int countnum = 0;
		for (int i = 0; i <= name.length() - 1; i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I'
					|| name.charAt(i) == 'O' || name.charAt(i) == 'U') {
					System.out.println("vowels: "+name.charAt(i));
					countnum++;
			}
		}
		System.out.println("numbers of vowels are: "+countnum);
	}
}
