import java.util.*;
public class Question3
{
	public static void main(String[] args) 
	{
		int i,x,n,sum=0;
		Scanner get = new Scanner(System.in);

		System.out.print("enter the value of x");
		x=get.nextInt();
		System.out.print("enter the no. of terms");
		n=get.nextInt();

		for(i=1;i<=n;i++)
		{
			sum=sum+(1+x+x*2);
			// did not get the pattern equation in questi0n
		}
		System.out.print("sum is:" + sum);
	}
}