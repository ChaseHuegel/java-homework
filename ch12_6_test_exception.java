public class TestException  
{
	public static void main(String[] args) 
	{
		try 
		{
			outputln(sum(new int[] {1, 2, 3, 4, 5}));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			outputln("\n" + ex.getMessage());
			outputln("\n" + ex.toString());

			outputln("\nTrace Info Obtained from getStackTrace");
			
			StackTraceElement[] traceElements = ex.getStackTrace();
			for (int i = 0; i < traceElements.length; i++) 
			{
				output("method " + traceElements[i].getMethodName());
				output("(" + traceElements[i].getClassName() + ":");
				outputln(traceElements[i].getLineNumber() + ")");
			}
		}
	}

	private static int sum(int[] list) 
	{
		int result = 0;
		for (int i = 0; i <= list.length; i++)
		{
			result += list[i];
		}
		return result;
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
