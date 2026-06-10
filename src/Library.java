
public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books book1 = new Books();

		book1.setBooksDetails(1, 2);

		book1.setRead(1);
		book1.printBooksDetails();

		book1.setBuy(2);
		book1.printBooksDetails();
	}

}

class Books {
	private int read;
	private int buy;

	void setBooksDetails(int a, int b) {
		read = a;
		buy = b;

	}

	void setRead(int a) {
		read = a;
	}

	void setBuy(int b) {
		buy = b;
	}

	void printBooksDetails() {
		
		System.out.println("Books read : " + read);
		System.out.println("Books buy : " + buy);
	}

}
	