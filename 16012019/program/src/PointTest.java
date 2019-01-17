import java.util.*;
class PointTest
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the values of Point 1:");
		System.out.println("Enter the value of x:");
		double x = in.nextDouble();
		System.out.println("Enter the value of y:");
		double y = in.nextDouble();

		Point p1 = new Point(x,y);
		System.out.println("Point 1 X:" + p1.getX() + "Y:" + p1.getY());

		Point p2 = new Point();
		System.out.println("Enter the values of Point 2:");
		System.out.println("Enter the value of x:");
		x = in.nextDouble();
		p2.setX(x);
		System.out.println("Enter the value of y:");
		y = in.nextDouble();
		p2.setY(y);

		System.out.println("Point 2 X :" + p2.getX() + "Y :" + p2.getY());

		Point p3 = new Point();
		p3 = p1.distance(p2);
		System.out.println("Distance X :" + p3.getX() + "Y :" + p3.getY());
	}
}