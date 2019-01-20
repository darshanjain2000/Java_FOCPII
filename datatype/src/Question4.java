import java.util.*;
public class Question4 
{

    public static void main(String[] args)
    {

        char ch;
        Scanner get= new Scanner(System.in);
        System.out.println("Entre a single character");
        ch=get.next().charAt(0);
       
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
        {
        	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            	System.out.println(ch + " is vowel");
        	else
            	System.out.println(ch + " is constant");
    	}
    	else
    		System.out.println("please enter a valid or single alphabet");

    }
}