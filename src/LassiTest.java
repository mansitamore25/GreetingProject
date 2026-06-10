
public class LassiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curd curd = new Curd("Thick", "white", "Buffalow Milk", 500);
		Water water = new Water("Bisleri", 50);
		Sugar sugar = new Sugar("brown", "organic", 100);
		Ice ice = new Ice("Raw", -5, 200);

		System.out.println("curd  " + curd);
		System.out.println("water " + water);
		System.out.println("sugar " + sugar);
		System.out.println("ice   " + ice);

		Blender blender = new Blender();
		Lassi lassi = blender.blend("Keshar ", curd, water, sugar, ice);

		System.out.println("Lassi : " + lassi);
	}
}

class Blender {
	Lassi blend(String lassiType,Curd c, Water w, Sugar s, Ice i) {
		
		System.out.println("Creating lassi from "+c.quantity+" grams curd");
		System.out.println("Adding water "+w.quantity+" ML");
		System.out.println("Adding sugar "+s.quantity+" grams");
		System.out.println("Adding ice   "+  i.quantity+ " grams");
		System.out.println("Blending....");
		
		Lassi lassi = new Lassi(lassiType, c.quantity+w.quantity+i.quantity+s.quantity, return lassi);
	}

}

class Lassi {
	String type;
	float quantity;
	float temperature;
	float sweetLevel;

	public Lassi(String type, float quantity, float temperature, float sweetLevel) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
		this.sweetLevel = sweetLevel;
	}

	@Override
	public String toString() {
		return "Lassi [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + ", sweetLevel="
				+ sweetLevel + "]";
	}

}

class Curd {
	String density;
	String color;
	String source;

	float quantity;

	public Curd(String density, String color, String source, float quantity) {
		super();
		this.density = density;
		this.color = color;
		this.source = source;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Curd [density=" + density + ", color=" + color + ", source=" + source + ", quantity=" + quantity + "]";
	}

}

class Water {
	String type;
	float quantity;

	public Water(String type, float quantity) {
		super();
		this.type = type;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + "]";
	}

}

class Ice {
	String type;
	float temperature;
	float quantity;

	public Ice(String type, float temperature, float quantity) {
		super();
		this.type = type;
		this.temperature = temperature;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Ice [type=" + type + ", temperature=" + temperature + ", quantity=" + quantity + "]";
	}

}

class Sugar {
	String color;
	String type;
	float quantity;

	public Sugar(String color, String type, float quantity) {
		super();
		this.color = color;
		this.type = type;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Sugar [color=" + color + ", type=" + type + ", quantity=" + quantity + "]";
	}

}
