import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		System.out.println("Enter any first number : ");
		int number1 = scanner1.nextInt(); // ready made function to accept value from keyboard

		System.out.println("Enter any second number : ");
		int number2 = scanner2.nextInt();

		int number3 = number1 + number2; // 130
		int number4 = number1 - number2;// 70
		int number5 = number1 * number2; // 3000
		int number6 = number1 / number2; // 3
		int number7 = number1 % number2; // 10

		System.out.println("Addition of   " + number1 + " and " + number2 + " is " + number3);
		System.out.println("Subtraction of    " + number1 + " and " + number2 + " is " + number4);
		System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + number5);
		System.out.println("Division of     " + number1 + " and " + number2 + " is " + number6);
		System.out.println("Modulus of   " + number1 + " and " + number2 + " is " + number7);

	}
}
