import java.util.*;

public class TestCalendar 
{
	public static void main(String[] args) 
	{
		Calendar calendar = new GregorianCalendar();
		outputln("Current time is " + new Date());
		outputln("YEAR:\t" + calendar.get(Calendar.YEAR));
		outputln("MONTH:\t" + calendar.get(Calendar.MONTH));
		outputln("DATE:\t" + calendar.get(Calendar.DATE));
		outputln("HOUR:\t" + calendar.get(Calendar.HOUR));
		outputln("HOUR_OF_DAY:\t" + calendar.get(Calendar.HOUR_OF_DAY));
		outputln("MINUTE:\t" + calendar.get(Calendar.MINUTE));
		outputln("SECOND:\t" + calendar.get(Calendar.SECOND));
		outputln("DAY_OF_WEEK:\t" + calendar.get(Calendar.DAY_OF_WEEK));
		outputln("DAY_OF_MONTH:\t" + calendar.get(Calendar.DAY_OF_MONTH));
		outputln("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		outputln("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
		outputln("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
		outputln("AM_PM: " + calendar.get(Calendar.AM_PM));

		Calendar calendar1 = new GregorianCalendar(2001, 8, 11);
		outputln("September 11, 2001 is a " + dayNameOfWeek(calendar1.get(Calendar.DAY_OF_WEEK)));
	}

	public static String dayNameOfWeek(int dayOfWeek) 
	{
		switch (dayOfWeek) 
		{
			case 1: return "Sunday";
			case 2: return "Monday";
			case 3: return "Tuesday";
			case 4: return "Wednesday";
			case 5: return "Thursday";
			case 6: return "Friday";
			case 7: return "Saturday";
			default: return null;
		}
	}

	public static void output(String _output)
	{
		System.out.print(_output);
	}

    public static void outputln()
	{
		System.out.println();
	}

	public static void outputln(String _output)
	{
		System.out.println(_output);
	}
}
