package Practice_Java_Interview_Questions;

public class FactorialOfTheNumber_5 {
	public static void main(String[] args) {
		int a = 5;
		int fact = 1;
		while (a > 0) {
			fact = fact * a;
			a -= 1;
		}
		System.out.println(fact);
	}

}
