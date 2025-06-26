package Practice_Java_Interview_Questions;

import java.sql.Timestamp;
import java.util.Date;

public class FindDate_WithTime_UsingTimeStamp 
{
	public static void main(String[] args)
	{
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		System.out.println(ts);
	}
}
