import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);

		System.out.println("Enter Principal amount : ");
		int number1 = scanner1.nextInt();

		System.out.println("Enter Intrest rate : ");
		int number2 = scanner2.nextInt();

		System.out.println("Enter No of years or months : ");
		int number3 = scanner3.nextInt();

		int SimpleIntrest = (number1 * number2 * number3 / 100);

	}

}
