import java.util.*;
class Point
{
	private double x;
	private double y;

	Point()
	{
		x=0.0;
		y=0.0;
	}
	Point(double x)
	{
		this.x=x;
	}
	Point(double x, double y)
	{
		this.x= x;
		this.y= y;
	}
	double getX()
	{
		return x;
	}
	double getY()
	{
		return y;
	}
	void setX(double x)
		{
			this.x=x;
		}
	void setY(double y)
	{
		this.y=y;
	}

	Point distance(Point p1)
	{
		Point p2= new Point();
		p2.x = p1.x -this.x;
		p2.y = p2.y -this.y;
		return p2;
	}
}