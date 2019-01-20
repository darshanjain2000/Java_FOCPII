import java.util.*;
class Circle
{
	private double radius;
	private String color;
	private final double pi = 3.14;

	public Circle()
	{
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius)
	{
		this.radius = radius;
	}
	public Circle(double radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public double getArea()
	{
		return(pi*radius*radius);
	}
	

}
class Cylinder extends Circle
{
	private double height;

	public Cylinder()
	{
		height = 1.0;
	}
	public Cylinder(double radius)
	{
		super(radius);
	}
	public Cylinder(double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	public Cylinder(double radius, String color, double height)
	{
		super(radius, color);
		this.height = height;
	}
	public double getHeight()
	{
		return( height);
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double getVolume()
	{
		return(super.getArea()*height);
	}
	public static void main(String[] args)
	{
		Cylinder cy1 = new Cylinder(2,"blue",3);
		System.out.println(cy1.getVolume());
		System.out.println(cy1.getArea());
		System.out.println(cy1.getColor());
		
	}
}