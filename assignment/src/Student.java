import java.util.*;
class Student
{
	String firstName;
	String lastName;
	Address addr;
	String dob;
	String Date;
	String [] skills;
	Qualification [] qual;
	Project [] projects;
	String eMail;
	String contactNo;


	Student()
	{
		firstName =null;
		lastName =null;
		addr =null;
		dob =null;
		skills =null;
		qual=null;
		eMail=null;
		contactNo=null; 
	}

	
	Student(String firstName,String lastName,Address addr,String dob,String[] skills,Qualification[] qual,String eMail,String contactNo)
	{
		this.firstName =firstName;
		this.lastName =lastName;
		this.addr =addr;
		this.dob =dob;
		this.skills =skills;
		this.qual=qual;
		this.eMail=eMail;
		this.contactNo=contactNo;
	}
	void display()
	{
		int i;

		System.out.println(firstName);
		System.out.println(lastName);
	    System.out.println(dob);
	    System.out.println(eMail);
		System.out.println(contactNo);
      		
		Address a1= new Address();
		a1.display();

		Qualification q1=new Qualification();
		for(i=0;i<qual.length;i++)
		q1.display();

		for(i=0;i<skills.length;i++)//skills
      	System.out.println(skills[i]);

		Project p1=new Project();
		for(i=0;i<5;i++)
		p1.display();
	}
}