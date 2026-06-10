
public class InnerlLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;

		while (x <= 3) {
			System.out.println("outer x " + x);

			int y = 1;
			while (y <= 15) {
				System.out.println("\tinner x " + x);
				System.out.println("\tinner y " + y);

				System.out.println(" " + x * y + " ");

			}

			System.out.println("\n-----------\n");

		}

	}

}
