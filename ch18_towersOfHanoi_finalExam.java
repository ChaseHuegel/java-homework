import java.util.Scanner; 

public class TowersOfHanoi 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		output("Enter number of disks: ");
		int n = input.nextInt();

		outputln("The moves are: ");
		moveDisks(n, 'A', 'B', 'C');
	}

	public static void moveDisks(int _n, char _from, char _to, char _aux) 
	{
		if (_n == 1)
		{
			outputln("Moved disk " + _n + " from " + _from + " to " + _to);
		}
		else 
		{
			moveDisks(_n - 1, _from, _aux, _to);
			outputln("Moved disk " + _n + " from " + _from + " to " + _to);
			moveDisks(_n - 1, _aux, _to, _from);
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