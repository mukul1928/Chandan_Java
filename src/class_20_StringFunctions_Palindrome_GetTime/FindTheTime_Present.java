package class_20_StringFunctions_Palindrome_GetTime;

import java.util.Date;

public class FindTheTime_Present
{
public static void main(String[] args) {
	Date d = new Date();
	System.out.println(d.getTime()); // This will give you time in the epoch time format you will have to convert it by epoch converter by going to google
	Date d1 = new Date(d.getTime());// this will give you the human understandable time format this time
	System.out.println(d1);
}
}
