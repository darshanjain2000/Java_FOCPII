import java.util.*;
import java.util.*;
class Program1
{
	public static void main(String[] args) 
	{
		char ch;
		Scanner in= new Scanner(System.in);

		System.out.println("1. for ArithmeticException ");
		System.out.println("2. for ArrayIndexOutOfBoundsException");
		System.out.println("3. for  NumberFormatException ");
		System.out.println("4. for  NullPointerException ");
		System.out.println("5. for  IllegalArgumentException ");
	do
	{

		int b=in.nextInt();

		switch(b)
		{
			case 1: 
			try
			{
				System.out.println("Enter 2 no.s");
				int x=in.nextInt();
				int y=in.nextInt();
				int num=x/y;
				System.out.println("Divition of 2 given no.s is " + num);
			}
			catch(ArithmeticException e)
			{
				System.out.println("second no. cannot ne zero for divition");
			}
            break;


			case 2:
			try
			{
				 System.out.println("Enter the length of array");
				 int a=in.nextInt();
				 int arr[]=new int[a];
				 System.out.println("Enter the index no. and its value");
				 int i=in.nextInt();
				 arr[i]=in.nextInt();
				 System.out.println(arr[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Given entered index if out of length");
			}
			break;

			case 3:
			try
			{
				int num=Integer.parseInt ("XYZ") ;
	 			System.out.println(num);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Number format exception occurred");
			}
			break;

			case 4:
			try
			{
				String str=null;
				System.out.println (str.length());
			}
			catch(NullPointerException e)
			{
				System.out.println("NullPointerException..");
			}
			break;

			case 5:
			try
			{

			}
			catch(IllegalArgumentException e)
			{

			}
			break;
	    }
	    System.out.println("Enter n to exit else any other key");
	    ch = in.next().charAt(0);
	}while(ch != 'n');
	System.out.println("made by darshan");

	}
}