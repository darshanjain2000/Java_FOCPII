import java.util.*;
class Circle 
{
	int r;
	final  double PI = 3.14;
	Circle()
	{
		r=1;
	}
	Circle(int r)
	{
		this.r=r;
	}
	void area()
	{
		System.out.println("The Area is:"+(PI*r*r));
	}
	void circumfrance()
	{
         System.out.println("The Circumfrence is :"+(2*PI*r));
	}
	void display()
	{
		System.out.println("radius:"+r);
		area();
		circumfrance();
	}
}
public class CircleTest
{
	public static void main(String[] args)
	{
    	Scanner in=new Scanner(System.in);
	    Circle c1=new Circle();
	    c1.display();
	    System.out.print("Enter the radius:");
	    int r = in.nextInt();
	    Circle c2=new Circle();
	    c2.display();
	}
	
}