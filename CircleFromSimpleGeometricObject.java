package ch11_4_simple_object;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject
{
	private double radius;

	public CircleFromSimpleGeometricObject() {}

	public CircleFromSimpleGeometricObject(double _radius)
	{
		this.radius = _radius;
	}

	public CircleFromSimpleGeometricObject(double _radius, String _color, boolean _filled)
	{
		this.radius = _radius;
		setColor(_color);
		setFilled(_filled);
	}

	public double getRadius()
	{
		return radius;
	}

	public void setRadius(double _radius)
	{
		this.radius = _radius;
	}

	public double getArea()
	{
		return radius * radius * Math.PI;
	}

	public double getDiameter()
	{
		return radius * 2;
	}

	public double getPerimeter()
	{
		return radius * 2 * Math.PI;
	}

	public void printCircle()
	{
		System.out.println("Circle with radius " + radius + " created. (" + getDateCreated() + ")");
	}
}
