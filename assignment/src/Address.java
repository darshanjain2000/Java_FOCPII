import java.util.*;
class Address
{
	String line1;
	String line2;
	String city;
	String state;
	int pinCode;

	Address()
	{
		line1=" ";
		line2=" ";
		city=" ";
		state=" ";
		pinCode = 0;
	}
	Address(String line1,String line2,String city,String state,int pinCode )
	{
		this.line1=line1;
		this.line2=line2;
		this.city=city;
		this.state=state;
		this.pinCode =pinCode;
	}
	void display()
	{
		System.out.println(line1+"\n"+line2+"\n"+city+", "+state+","+pinCode);
	}
}