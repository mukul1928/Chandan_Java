package Practice_Java_Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerMapConcept {
	public static void main(String[] args) {
		Map<Long, String> m1 = new HashMap<Long, String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter serial number: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Account Number: ");
			long accountnumber = sc.nextLong();
			System.out.println("Enter Accountholder Name: ");
			String accountholder = sc.next();
			m1.put(accountnumber, accountholder);
		}
	}
}
