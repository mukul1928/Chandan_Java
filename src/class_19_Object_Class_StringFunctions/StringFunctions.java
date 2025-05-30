package class_19_Object_Class_StringFunctions;

public class StringFunctions 
{
	public static void main(String[] args) 
	{
		String name = "Chandan Pandey";
		int c1 = name.length();
		System.out.println("The length of the given String is: "+c1);
		
		String s1 = name.toUpperCase();
		System.out.println(s1);
		
		String s2 = name.toLowerCase();
		System.out.println(s2);
		
		char c = name.charAt(1);
		System.out.println(c);
		
		String nam1 = "     Chandan Kumar Pandey";
		System.out.println(nam1);
		String s = nam1.trim();
		System.out.println(s);
		
		String name1 = "Ram";
		String surname = " Pandey";
		String space = " ";
		String fullname = name1.concat(surname);
		System.out.println(fullname);
		//String fullname1 = name1.concat(space).concat(surname);
		//System.out.println(fullname1);
	}
}
