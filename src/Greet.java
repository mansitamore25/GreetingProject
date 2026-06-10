
public class Greet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello all");
		System.out.println("java is easy");
		Chef mansi = new Chef();
		mansi.cooking();
		mansi.baking();
		mansi.stiring();

		Star shineObj1 = new Star();
		shineObj1.producing();
		shineObj1.direction();
		shineObj1.amazing();

		Flower floObj1 = new Flower();
		floObj1.beautiful();
		floObj1.bright();
		floObj1.happy();

		Youtube ytObj1 = new Youtube();
		ytObj1.filimg();
		ytObj1.editing();
		ytObj1.posting();

		Football footyObj1 = new Football();
		footyObj1.cooking();
		footyObj1.dribbling();
		footyObj1.scoring();

	}

}

class Chef {
	void cooking() {
		System.out.println("cooking rice");
	}

	void baking() {
		System.out.println("baking a cake");
	}

	void stiring() {
		System.out.println("stiring soup");
	}
}

class Star {
	void producing() {
		System.out.println("producing light and heat");
	}

	void direction() {
		System.out.println("gives direction to the sailor");
	}

	void amazing() {
		System.out.println("the most amazing star is The Nebula");
	}
}

class Flower {
	void beautiful() {
		System.out.println("Roses are very beautiful");
	}

	void bright() {
		System.out.println("Sunflowers are very bright");
	}

	void happy() {
		System.out.println("Flowers make me happy");
	}
}

class Youtube {
	void filimg() {
		System.out.println("Filming is an art ");
	}

	void editing() {
		System.out.println("Editing is fun ");
	}

	void posting() {
		System.out.println("posting makes you feel confident");
	}

}

class Football {
	void cooking() {
		System.out.println("Messi is cooking bayern in ucl");
	}

	void dribbling() {
		System.out.println("Messi is dribbling as smooth as butter");
	}

	void scoring() {
		System.out.println("Kvaratskelia is always scoring top class goals");
	}

}
