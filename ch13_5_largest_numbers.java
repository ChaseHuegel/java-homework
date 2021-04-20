import java.util.ArrayList;
import java.math.*;

public class LargestNumbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Number> list = new ArrayList<Number>();

		list.add(45);
		list.add(3445.53);
		list.add(new BigInteger("3432323234344343101")); 
		list.add(new BigDecimal("2.0909090989091343433344343")); 

		outputln("The largest number is " + getLargestNumber(list));
	}

	public static Number getLargestNumber(ArrayList<Number> list) 
	{
		if (list == null || list.size() == 0) 
		{
			return null;
		}

		Number number = list.get(0);
		
		for (int i = 1; i < list.size(); i++)
		{
			if (number.doubleValue() < list.get(i).doubleValue())
			{
				number = list.get(i);
			}
		}

		return number;
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
