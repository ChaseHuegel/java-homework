package ch6_10_random_character_exam;

public class RandomCharacter
{
    final int NUMBER_OF_CHARS = 175;
    final int CHARS_PER_LINE = 25;

    public void main(String[] args) 
    {
        for (int i = 0; i < NUMBER_OF_CHARS; i++)
        {
            char thisChar = getRandomLowerCaseLetter();

            if ((i + 1) % CHARS_PER_LINE == 0)
            {
                outputln(thisChar);
            }
            else
            {
                output(thisChar);
            }
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

    public static char getRandomCharacter(char _char1, char _char2)
    {
        return (char)(_char1 + Math.random() * (_char2 - _char1 + 1));
    }

    public static char getRandomLowerCaseLetter()
    {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter()
    {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter()
    {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter()
    {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
