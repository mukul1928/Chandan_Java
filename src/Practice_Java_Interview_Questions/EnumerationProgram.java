package Practice_Java_Interview_Questions;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProgram {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Chandan");
		v.add("Pandey");
		v.add("Bangalore");
		System.out.println(v);

		Enumeration v1 = v.elements();
		while (v1.hasMoreElements()) {
			System.out.println(v1.nextElement());
		}
	}
}
