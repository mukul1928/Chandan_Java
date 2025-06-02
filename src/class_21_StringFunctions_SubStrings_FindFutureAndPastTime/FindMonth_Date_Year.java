package class_21_StringFunctions_SubStrings_FindFutureAndPastTime;

import java.util.Date;

public class FindMonth_Date_Year 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime()+(1000*60*60*24*1)); //for finding the future time + for finding the past time -
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
		//date format-> DD MMM YYYY
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat("").concat(month).concat(" ").concat(year));
		//date format-> DD-MMM-YYYY
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		//date format-> DD/MMM/YYYY
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}
}
