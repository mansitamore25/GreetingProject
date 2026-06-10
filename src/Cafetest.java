
public class Cafetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cafetest cafe = new cafe("Beige ", "Mansi", 25, 000, "Too good");

	}

}

class cafe {

	@Override
	public String toString() {
		return "cafe [interior=" + interior + ", owner=" + owner + ", rent=" + rent + ", review=" + review + "]";
	}

	public cafe(String interior, String owner, int rent, String review) {
		super();
		this.interior = interior;
		this.owner = owner;
		this.rent = rent;
		this.review = review;
	}

	private String interior;
	private String owner;
	private int rent;
	private String review;

}


	@Override
	public String toString() {
		return "cafe [[interior=\" + interior + \", owner=\" + owner + \", rent=\" + rent + \", review=\" + review + \"]\";
}













