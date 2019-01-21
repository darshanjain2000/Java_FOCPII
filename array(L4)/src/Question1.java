import java.util.*;
class Question1
{
	public static void main(String[] args)
	 {
			Scanner input = new Scanner(System.in);

			System.out.print("Enter rows: ");
			int rows = input.nextInt();

			System.out.print("Enter columns: ");
			int columns = input.nextInt();

			int[][] array = new int[rows][columns];
			int num;
			int num2;
			System.out.println("Enter 2 digit number ");
	
			for(int i = 0; i<rows; i++)
			{
			    for(int j = 0; j<columns; j++)
			    {
			    	System.out.print("Enter element of row "+(i+1)+" and column "+(j+1)+": ");
			        num = input.nextInt();

			        if(num >= (-99) && num <= 99)
			        {
			        	array[i][j] = num;
			        }
			        else
			        {
			        	System.out.print("Invalid input , re-enter : ");
			        	j--;
			        }
			    }
			}
			System.out.println("Original array : ");

			for(int i = 0; i<rows; i++)
			{
			    for(int j = 0; j<columns; j++)
			    {
			        System.out.print(array[i][j]+"\t");
			    }
			    System.out.println();
			}
			System.out.println("New array : ");

			for(int i = 0; i<rows; i++)
			{
			    for(int j = 0; j<columns; j++)
			    {
			    	if(array[i][j]%2 == 0){
			    		num2 = array[i][j];
			    	}
			    	else{
			    		num2 = array[i][j]*2;
			    	}
			        System.out.print(num2+"\t");
			    }
			    System.out.println();
			}
	}	
}