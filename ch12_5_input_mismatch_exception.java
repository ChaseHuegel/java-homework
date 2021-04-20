import java.util.*;

public class InputMismatchExceptionDemo 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;

		do 
		{
			try 
			{
				output("Enter an integer: ");
				int number = input.nextInt();

				outputln("The number entered is " + number);
				
				continueInput = false;
			} 
			catch (InputMismatchException ex) 
			{
				outputln("Try again. (Incorrect input: an integer is required)");
				input.nextLine();
			}
		} while (continueInput);
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
