public class TestEdible 
{
	public static void main(String[] args) 
	{
		Object[] objects = {new Tiger(), new Chicken(), new Apple()};
		for (int i = 0; i < objects.length; i++) 
		{
			if (objects[i] instanceof Edible)
			{
				outputln(((Edible)objects[i]).howToEat());
			}

			if (objects[i] instanceof Animal) 
			{
				outputln(((Animal)objects[i]).sound());
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
}


abstract class Animal 
{
	public abstract String sound();
}

class Chicken extends Animal implements Edible 
{
	@Override
	public String howToEat() 
	{
		return "Chicken: Fry it";
	}

	@Override
	public String sound() 
	{
		return "Chicken: cock-a-doodle-doo";
	}
}

class Tiger extends Animal 
{
	@Override
	public String sound() 
	{
		return "Tiger: RROOAARR";
	}
}

abstract class Fruit implements Edible 
{
}

class Apple extends Fruit 
{
	@Override
	public String howToEat() 
	{
		return "Apple: Make apple cider";
	}
}

class Orange extends Fruit 
{
	@Override
	public String howToEat() 
	{
		return "Orange: Make orange juice";
	}
}