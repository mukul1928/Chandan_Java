package Infosys_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class HashMap_SimpleProgram {
	public static void main(String[] args) {
		Map<Integer, String> emp = new HashMap<Integer, String>();
		emp.put(101, "Chandan");
		emp.put(102, "Mukul");
		emp.put(103, "Khushboo");
		emp.put(104, "Chandana");
		emp.put(106, "Shail");
		for (Map.Entry<Integer, String> entry : emp.entrySet()) {
			System.out.println("Employee ID: " + entry.getKey() + " Employee name:" + entry.getValue());
		}
	}
}
