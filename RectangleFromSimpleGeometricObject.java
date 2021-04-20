package ch11_3_simple_object;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject
{
	private double width;
	private double height;

    public RectangleFromSimpleGeometricObject() {}

	public RectangleFromSimpleGeometricObject(double _width, double _height)
	{
		this.width = _width;
		this.height = _height;
	}

	public RectangleFromSimpleGeometricObject(double _width, double _height, String _color, boolean _filled)
	{
		this.width = _width;
		this.height = _height;
		setColor(_color);
		setFilled(_filled);
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double _width)
	{
		this.width = _width;
	}

	public double getHeight()
	{
		return height;
	}

	public double setHeight(double _height)
	{
		this.height = _height;
	}

	public double getArea()
	{
		return width * height;
	}

	public double getPerimeter()
	{
		return 2 * (width + height);
	}
}
