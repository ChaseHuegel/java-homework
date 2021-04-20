import java.io.File;
import java.util.Scanner; 

public class DirectorySize 
{
	public static void main(String[] args) 
	{
		output("Enter a directory or a file: ");    
		Scanner input = new Scanner(System.in);
		String directory = input.nextLine();

		outputln(getSize(new File(directory)) + " bytes");
	}

	public static long getSize(File _file) 
	{
		long size = 0;

		if (_file.isDirectory()) 
		{
			File[] files = _file.listFiles();
			for (int i = 0; i < files.length; i++) 
			{
				size += getSize(files[i]);
			}
		}
		else 
		{
			size += _file.length();
		}

		return size;
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