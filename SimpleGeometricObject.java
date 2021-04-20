package ch11_1_simple_object;

public class SimpleGeometricObject
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

    public SimpleGeometricObject()
	{
		dateCreated = new java.util.Date();
	}

	public SimpleGeometricObject(String _color, boolean _filled)
	{
		dateCreated = new java.util.Date();
		this.color = _color;
		this.filled = _filled;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String _color)
	{
		this.color = _color;
	}

	public boolean isFilled()
	{
		return filled;
	}

	public void setFilled(boolean _filled)
	{
		this.filled = _filled;
	}

	public java.util.Date getDateCreated()
	{
		return dateCreated;
	}

	public String toString()
	{
		return "Created on :" + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
	}
}
