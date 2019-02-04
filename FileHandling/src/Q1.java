import java.io.*;
import java.util.*;
class  Q1
{
   public static void main(String[] args) 
   {
      File f = null;
      try 
      {
            f = new File("Question1.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);

       System.out.println("To Exit Program Enter M");
       System.out.print("\nEnter the number of students\n");
       int n =sc.nextInt();
        bout.write("\t" + "Serial no." +"\t" +"First Name" + "\t" + "cgpa" +"\t" + "Grade");
        bout.newline();
      while(sc.hasNext())
       {
          for (int i=1;i<=n;i++)
            {
              System.out.println("Enter the detail of " + i + " student: ");

              System.out.println("Enter the Serial no. of student");
              int srno = sc.nextInt();

              System.out.println("Enter the First Name of student");
              String fname = sc.next();

              System.out.println("Enter the CGPA of student");
              float cgpa = sc.nextFloat();

              System.out.println("Enter the Grade of student");
              char grd = sc.next().charAt(0);

               bout.write("\t" + srno + "\t\t" +fname + "\t\t"+cgpa +"\t"+grd);
               bout.newLine();
            }
              
              
               char ch = sc.next().charAt(0);
               if(ch =='M')
                break;
        }
            bout.close();
      }         
    catch (Exception e) 
    {
         // if any I/O error occurs
         e.printStackTrace();
     }
   }
 }  