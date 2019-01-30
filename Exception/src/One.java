import java.util.*;
class One
{
	int a;
	int b;
	One(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	int Divide()
	{
		return a/b;
	}
	public static void main(String[] args) 
	{
		One t1 = new One(3,4);
		One t2 = new One(5,0);
		try
		{
			if(t2.b==0)
			{
				throw new ArithmeticException("Value of b cannot be zero");
			}
			System.out.println(t2.Divide());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(t1.Divide());
		}
		System.out.println("Error");
	}
}