import java.util.*;
class Qualification
{
	String qualName;
	String university;
	String institute;
	float cgpa;

	Qualification()
	{
		qualName=" ";
		university=" ";
		institute=" ";
		cgpa=0.0f;
		
	}
	Qualification(String qualName,String university,String institute,float cgpa)
	{
		this.qualName=qualName;
		this.university=university;
		this.institute=institute;
		this.cgpa=cgpa;
	}
	void display()
	{
			System.out.println(qualName);
			System.out.println(university);
	        System.out.println(institute);
      		System.out.println(cgpa);
	}
}