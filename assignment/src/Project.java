import java.util.*;
class Project
{
	String name;
	String role;
	String startDate;
	String endDate;
	String responsiblity;

	Project()
	{
		name=" ";
		role=" ";
		startDate=" ";
		endDate=" ";
		responsiblity=" ";
		
	}
	Project(String name,String role)
	{
		this.name=name;
		this.role=role;
		this.startDate=startDate;
		this.endDate=endDate;
	    this.responsiblity=responsiblity;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(role);
		System.out.println(startDate);
		System.out.println(endDate);

	}
}