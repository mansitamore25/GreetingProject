
public class MagicianTest {

	// TODO Auto-generated method stub

	public static void main(String[] args) {
		Magician wizard = new Magician();

		String outcome = wizard.performTrick("hat");

		System.out.println(outcome);
		wizard.waveWand();

		wizard.trick(7);
	}

}

class Magician {
	public String performTrick(String item) {// 3rd type function
		// Core logic of the function
		String result = " Abracadabra! Your " + item + " turned into a white rabbit! ";
		return result;
	}

	public void waveWand() { // 1st type function
		System.out.println("Magician is waving the wand ");
	}

	public void trick(int seconds) { // 2nd type funtion
		System.out.println("Magician is tricking for  " + seconds + " seconds");
	}

	public float generatePebbles() { //4th type function 
		return 10.0f
	}
}