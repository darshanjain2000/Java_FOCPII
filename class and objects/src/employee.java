import java.util.*;
class Employee()
{
	String name;
	int yearJoining;
	double salary;
	String address;

  Employee()
   {
	name ="";
	yearJoining=0;
	salary=0.0;
	address="";
   } 

  Employee( String name, int yearJoining, double salary, String address)
   {
	this.name= name;
	this.yearJoining=yearJoining;
	this.salary=salary;
	this.address=address;
    }
 void display()
    {
 	System.out.println("name" +\t "yearJoining+\t" salary+"\t" address+"\t");

    }	
 } 
 public static void main(String[] args) 
 {
 	Employee em= new Employee;

 	System.out.println("Enter the the name yearJoining salary and address of Employee");
 	Scanner s = new Scanner(System.in);
 		name= s.next();
 	    yearJoining= s.nextInt();
 	    salary= s.nextDouble();
 	    address= s.next();
 	em.display();
 }