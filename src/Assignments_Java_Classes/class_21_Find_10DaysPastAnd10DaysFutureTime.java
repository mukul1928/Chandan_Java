package Assignments_Java_Classes;

import java.util.Date;

public class class_21_Find_10DaysPastAnd10DaysFutureTime 
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime()-(1000*60*60*24*10));//10 days past time
		System.out.println(d1);
		Date d2 = new Date(d.getTime()+(1000*60*60*24*10));//10 days future time
		System.out.println(d2);
	}
}
