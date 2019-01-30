import java.util.*;
class StudentDrive
{

  public static void main(String[] args) 
  {
    int i;
		Scanner in = new Scanner(System.in);

    System.out.println("Enter the details of student");
    
    System.out.println("First Name : ");
    String firstName = in.nextLine();
            
    System.out.println("Last Name :");
    String lastName = in.nextLine();

    System.out.println("Date of birth :");
    String dob = in.nextLine();

    //skills
    System.out.println("enter the no. of skills: ");
    int x =in.nextInt();
    String skills[] = new String[x];

    for(i=0;i<x;i++)
    {
      System.out.println("Enter the skills; ")
      skills[i] = in.nextLine();
    } 

    //address
    System.out.println("Adress line1 :");
    String line1 = in.nextLine();
                 
    System.out.println("Adress line2 :");
    String line2 = in.nextLine();

    System.out.println("Adress city :");
    String city = in.nextLine();

    System.out.println("Adress state :");
    String state = in.nextLine();

    System.out.println("pinCode : ");
    int pinCode = in.nextInt();

    Address addr= new Address(line1,line2,city,state,pinCode);
    //qualification
    System.out.println("Enter the no. of Qualifications");
    int y = in.nextInt();
    Qualification q[] = new Qualification[y];

    for(i =0 ; i<y;i++)
    {
      System.out.println("Qualification - Qualification name :");
      String qualName = in.nextLine();

      System.out.println("Qualification - university :");
      String university = in.nextLine();

      System.out.println("Qualification - institute :");
      String institute = in.nextLine();

      System.out.println("Qualification - cgpa :");
      float cgpa = in.nextFloat();

      q[i] = new Qualification(qualName,university,institute,cgpa);
    }

    //project
    int l = in.nextInt();
    Project p[] = new Project[l];

    for(i=0;i<l;i++)
    {

      System.out.println("enter the name of projects");

      System.out.println("Project - Name : ");
      String name = in.nextLine();

      System.out.println("Project - startDate : ");
      String startDate = in.nextLine();

      System.out.println("Project - endDate : ");
      String endDate = in.nextLine();

      System.out.println("Project - role : ");
      String role  = in.nextLine();

      System.out.println("how many resposibilities you want to enter");
      int n = in.nextInt();
                    
      String resposibilities[] = new String[n];
      for(i=0;i<n;++i)
      {
        resposibilities[i] = in.nextLine();
      }
    }
    Project 

    Student s1 =new Student();

    s1.display();
    
  }    
}