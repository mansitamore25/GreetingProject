import java.util.Scanner;

public class ClassDesserts {
	public static void main(String[] args) {
		Desserts dessertobj1 = new Desserts();

		dessertobj1.setDetails("Cookie", "gluten-free", "chocolate", "chips", "cream");
		dessertobj1.printDetails();
		
		Desserts dessertobj2 = new Desserts();
		dessertobj2.setDetails("ice-cream", "natural", "Kesar-Pista", "Nuts", "Creamy");
		dessertobj2.printDetails();

	}
}

class Desserts {

	String name;
	String type;
	String flavour;
	String toppings;
	String addons;

	void printDetails() {
		System.out.println("\nName is : " + name);
		System.out.println("Type is : " + type);
		System.out.println("Flavour is : " + flavour);
		System.out.println("Toppings is : " + toppings);
		System.out.println("Add-ons is : " + addons);

	}

	public void setDetails(String nm, String ty, String fv, String top, String add) {
		// TODO Auto-generated method stub
		name = nm;
		type = ty;
		flavour = fv;
		toppings = top;
		addons = add;
	}

}
