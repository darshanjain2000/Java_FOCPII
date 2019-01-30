import java.util.*;
class VehicleTest{
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		Bike b1 = new Bike();
		int n = num.nextInt();
		switch(n){
			case 2 : b1.display();
			break;
			case 4 : b1.display();
			break;
			default : b1.display();
		}
	}
}