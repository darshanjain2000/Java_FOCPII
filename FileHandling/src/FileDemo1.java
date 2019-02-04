import java.io.*;
import java.util.*;
class FileDemo1 
{
   public static void main(String[] args) 
   {
      File f = null;
      try 
      {
            f = new File("file.txt");
            FileWriter fout = new FileWriter(f);
            BufferedWriter bout= new BufferedWriter(fout);
	     Scanner sc = new Scanner(System.in);
             System.out.print("\nEnter a String:");
              System.out.print("\nTo Exit Enter M\n");
 	     while(sc.hasNext())
       {
               bout.write(sc.nextLine());//input of string
               bout.newLine();//input for next line
               char ch = sc.next().charAt(0);//input of character
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