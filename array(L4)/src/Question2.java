import java.util.*;
class Question2
{
	static int i;
	static int[] array = new int[5];
	static Scanner in = new Scanner(System.in);
	
	static void enterElements(){
		System.out.print("Enter 5 integers:- ");
		for(i=0;i<5;i++){
			array[i] = in.nextInt(); 
		}
	}
	static void displayElements(){
		for(i=0;i<5;i++){
			System.out.print(array[i]+"\t");
		}
	}
	static void sumElements(){
		int sum = 0;
		for(i=0;i<5;i++){
			sum = sum + array[i];
		}
		System.out.println("The Sum is :- "+sum);
	}
	static void largestElement(){
		int big = 0;
		for(i=0;i<5;i++){
			if(big <= array[i]){
				big = array[i];
			}
			else{
				continue;
			}
			
		}
		System.out.println("The largest element is:- "+big);
	}
	static void smallestElement(){
		int small = 0;
		for(i=0;i<5;i++){
			if(small >= array[i]){
				small = array[i];
			}
			else{
				continue;
			}
			
		}
		System.out.println("The smallest element is:- "+small);
	}
	static void secondlargestElement(){
		int big = 0;
		int big2 = 0;
		for(i=0;i<5;i++){
			if(big <= array[i]){
				big2 = big;
				big = array[i];
			}
			else{
				continue;
			}
			
		}
		System.out.println("The second largest element is:- "+big2);
	}
	static void alternateSum(){
		int sum1 = 0;
		int sum2 = 0;
		for(i=0;i<5;i++){
			if(i%2 == 0){
				sum1 = sum1 + array[i];
			}		
			else{
				sum2 = sum2 + array[i];	
			}
		}
		System.out.println("Sum of even index elements :- "+sum1);
		System.out.println("Sum of odd index elements :- "+sum2);
	}
	static void countEven(){
		int count = 0;
		for(i=0;i<5;i++){
			if(array[i]%2 == 0){
				count++;
			}
			else{
				continue;
			}
		}
		System.out.println("Qty of even numbers:- "+count);
	}
	static void Occurence(){
		System.out.print("Enter the number to find the occurence of :- ");
		int n = in.nextInt();
		int count = 0;
		for(i=0;i<5;i++){
			if(array[i] == n){
				count++;
			}
			else{
				continue;
			}
		}
		System.out.println("Frequency:- "+count); 
	}
	

	public static void main(String[] args) {
		char c;
		do{
		enterElements();
		System.out.println("Select from the following options to display:- ");
		System.out.println("1. Elements \n2. Sum of Elements \n3. Largest number in the array\n4. Smallest number in the array\n5. Second largest number in the array\n6. Sum of alternate elements in the array\n7. Count of even numbers in the array\n8. Occurence of given number in the array ");
		int menu = in.nextInt();
		switch(menu){
			case 1 : displayElements();
			break;
			case 2 : sumElements();
			break;
			case 3 : largestElement();
			break;
			case 4 : smallestElement();
			break;
			case 5 : secondlargestElement();
			break;
			case 6 : alternateSum();
			break;
			case 7 : countEven();
			break;
			case 8 : Occurence();
			break;
		}
		System.out.print("Press any key to try with another array or press N to exit :- ");
		c = in.next().charAt(0);
		}while(c != 'N');		
	}
}