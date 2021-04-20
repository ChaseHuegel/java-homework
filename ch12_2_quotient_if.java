import java.util.Scanner; 

public class QuotientWithIf
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		output("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		if (number2 != 0)
		{
			outputln(number1 + " / " + number2 + " is " + (number1 / number2));
		}
		else
		{
			outputln("Divisor cannot be zero ");
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
