package Practice_Java_Interview_Questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class IncreaseTheCurrentDateBy_10 {

	public static void main(String[] args) throws ParseException {
		String dt = "2025-04-07";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(dt));
		c.add(Calendar.DATE, 10);
		dt = sdf.format(c.getTime());
		System.out.println(dt);
	}

}
