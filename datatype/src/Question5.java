import java.util.Scanner;
public class Question5
{
     public static void main(String[] args)
      {
          Scanner get = new Scanner(System.in);

          System.out.println("Enter number of rows to print:");
          int rows = get.nextInt();

          int i,j,k;
          System.out.println("Pascal Triangle:");

          for (i = 0; i < rows; i++) 
          {
              for (k = 0; k < rows - i; k++) 
              {
                   System.out.print(" ");
              }
              int number = 1;
              for (j = 0; j <= i; j++) 
              {
                  System.out.print(number + " ");
                  number = number * (i - j) / (j + 1);
              }
              System.out.println();
         }

     }
}