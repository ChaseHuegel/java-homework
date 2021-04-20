package ch11_4_simple_object;

public class TestCircleRectangle
{
	public static void main(String[] args)
	{
		CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
		RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);

		outputln("A circle " + circle.toString());
		outputln("The color is " + circle.getColor());
		outputln("The radius is " + circle.getRadius());
		outputln("The area is " + circle.getArea());
		outputln("The diameter is " + circle.getDiameter());

		outputln("\nA rectangle " + rectangle.toString());
		outputln("The area is " + rectangle.getArea());
		outputln("The perimeter is " + rectangle.getPerimeter());
	}

	public static void output()
	{
		System.out.print();
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
