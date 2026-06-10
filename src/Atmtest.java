
public class Atmtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ATM atm1 = new ATM(123, "Pune", 500000, 1000);
		ATM atm2 = new ATM(223, "Mumbai", 800000, 900);
		ATM atm3 = new ATM(523, "Jalgaon", 300000, 400);

		System.out.println("Atm1 : " + atm1);
		System.out.println("Atm2 : " + atm2);
		System.out.println("Atm3 : " + atm3);

		System.out.println("-----after setting teh cost-----");

		atm1.numberOfHits = 100;
		atm2.numberOfHits = 200;
		atm3.numberOfHits = 300;

		System.out.println("Atm1 : " + atm1);
		System.out.println("Atm2 : " + atm2);
		System.out.println("Atm3 : " + atm3);

	}
}

class ATM
{
	int atmNumber;
	String atmLocation;
	private double costLoaded;
	int numberOfHits;
	
	public ATM(int atmNumber, String atmLocation, double costLoaded, int numberOfHits) {
		super();
		this.atmNumber = atmNumber;
		this.atmLocation = atmLocation;
		this.costLoaded = costLoaded;
		this.numberOfHits = numberOfHits;
	}
	@Override
	public String toString() {
		return "ATM [atmNumber=" + atmNumber + ", atmLocation=" + atmLocation + ", costLoaded=" + costLoaded
				+ ", numberOfHits=" + numberOfHits + "]";
	}
	
	
	
	


}


