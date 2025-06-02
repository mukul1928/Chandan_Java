package class_21_StringFunctions_SubStrings_FindFutureAndPastTime;

import java.util.Date;

public class FindMonth_Date_Year 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime());
		System.out.println(d1);
		//month
		//date
		//year
		String a1 = d1.toString();
		String month = a1.substring(3, 7);
		System.out.println(month);
		String date = a1.substring(8, 10);
		System.out.println(date);
		System.out.println(a1.length());
		String year = a1.substring(24, 28);
		System.out.println(year);
	}
}
