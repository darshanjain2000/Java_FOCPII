import java.util.*;
class Question3
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int i;
		int j;
		double sum1 = 0;
		double sum2 = 0;
		double[][] sales = new double[5][4];
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print("Enter Sales of Product "+(i+1)+" by Sales person "+(j+1)+" :- ");
				double amt = in.nextDouble();
				sales[i][j] = amt;
			}
		}
		System.out.println("\t\tPerson1\tPerson2\tPerson3\tPerson4\t\tTotal");
		for(i=0; i<5;i++)
			{
				sum1=0;
				System.out.print("Product"+(i+1)+"\t");
			    for(j=0;j<4;j++)
			    {
			    	sum1 = sum1 + sales[i][j];
			        System.out.print(sales[i][j]+"\t");
			    }
			    System.out.print("\t"+sum1);
			    System.out.println();
			}

		System.out.print("Total   \t");	
		for(j=0;j<4;j++)
		{
			sum2 = 0;
			for(i=0;i<5;i++)
			{
				sum2 = sum2 + sales[i][j];
			}
			System.out.print(sum2+"\t");
		}	
	}
}