import java.util.*;
class Employee
{
	public String name;
	public int yearJoining;
	public double salary;
	public String address;

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
    void input()
    {
    	Scanner s = new Scanner(System.in);
 		name= s.next();
 	    yearJoining= s.nextInt();
 	    salary= s.nextDouble();
 	    address= s.next();
    }
 void display()
    {
 	System.out.println(name + "\t" + yearJoining + "\t" + salary + "\t" + address + "\t");

    }	
 public static void main(String args[]) 
 {
 	Employee e1= new Employee();
 	System.out.println("Enter the the name yearJoining salary and address of Employee");
 	e1.input();
 	e1.display();
 }
}