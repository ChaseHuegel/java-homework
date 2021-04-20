import java.util.ArrayList;

public class TestArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> cityList = new ArrayList<>();

		cityList.add("New York");
		cityList.add("Miami");
		cityList.add("Rome");
		cityList.add("Miami");

		outputln("List size? " + cityList.size()); 
		outputln("Is Miami in the list? " + cityList.contains("Miami")); 
		outputln("The location of Rome in the list? " + cityList.indexOf("Rome")); 
		outputln("Is the list empty? " + cityList.isEmpty());

		cityList.add(2, "Venice");
		cityList.remove("Miami");
		cityList.remove(1);

		outputln(cityList.toString());

		for (int i = cityList.size() - 1; i >= 0; i--)
		{
			output(cityList.get(i) + " ");
		}
		
		outputln();

		ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();

		list.add(new CircleFromSimpleGeometricObject(2));
		list.add(new CircleFromSimpleGeometricObject(3));

		outputln("The area of the circle? " + list.get(0).getArea());
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