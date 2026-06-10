     import java.util.Scanner;

public class Earthtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);

		System.out.println("Enter distance from earth to sun : ");
		int number1=scanner1.nextInt();
		
		System.out.println("Enter distance from moon to sun : ");
		int number2=scanner1.nextInt();
		
		System.out.println("Will be the distance from Earth to moon");
		int number3=scanner1.nextInt();
		
		int  number4=number1 - number2; 
		
		System.out.println( "Subtraction  of   " +  number1 + " and " + number2 + " is " + number3);
		
		
	
	
	}
	
	

}
