
public class Cameratest {

	// TODO Auto-generated method stub

	public static void main(String[] args) {

		Cameratest myCamera1 = new Camera("Sony", 24, "4k");
		Cameratest myCamera2 = new Camera("Nikon", 45, "6k");
		Cameratest myCamera3 = new Camera("Canon", 61, "8k");

		System.out.println("cam1 : " + myCamera1);
		System.out.println("cam2 : " + myCamera2);
		System.out.println("cam3 : " + myCamera3);

		Photographer photographer1 = new Photographer("Prakash", 6000, "Mumbai", 55);
		Photographer photographer2 = new Photographer("Mahesh", 50, "Thane", 18);

		System.out.println("photographer details1 : " + photographer1);
		System.out.println("photographer details2 : " + photographer2);

		Photo photo1 = new Photo("FullColor", 750, 450, "photopaper");
		Photo photo2 = new Photo("Black and White", 750, 350, "Normal Paper");
		Photo photo3 = new Photo("TriColor", 650, 250, "Curtain");
		Photo photo4 = new Photo("ShadedColor", 950, 750, "Sheet");

		System.out.println("photo 1 " + photo1);
		System.out.println("photo 2 " + photo2);
		System.out.println("photo 3 " + photo3);
		System.out.println("photo 4 " + photo4);

		PhotoScene scene1 = new PhotoScene("Passport", "Blue Curtain", "FullLight");
		PhotoScene scene2 = new PhotoScene("Picnic", "Mountains", "Cloudy");
		PhotoScene scene3 = new PhotoScene("Birthday", "Stage", "Decoration Light");
		PhotoScene scene4 = new PhotoScene("Marriage", "Reception Stage", "Full Decoration");
		PhotoScene scene5 = new PhotoScene("Party", "Bar", "DimLight");
		PhotoScene scene6 = new PhotoScene("Garden", "Roses", "Sunlight");
		PhotoScene scene7 = new PhotoScene("Hotel", "Tables", "Tubelight");

		System.out.println("scene1 : " + scene1);
		System.out.println("scene2 : " + scene2);
		System.out.println("scene3 : " + scene3);
		System.out.println("scene4 : " + scene4);
		System.out.println("scene5 : " + scene5);
		System.out.println("scene6 : " + scene6);
		System.out.println("scene7 : " + scene7);

	}

}

class Camera {
	String brand; // Nikon, Fujifilm, Sony
	int megaPixel; // 24,45,61
	String maxVideoResolution; // 4k,6k,8k

	public Camera(String brand, int megaPixel, String maxVideoResolution) {
		super();
		this.brand = brand;
		this.megaPixel = megaPixel;
		this.maxVideoResolution = maxVideoResolution;
	}

	@Override
	public String toString() {
		return "Camera [brand=" + brand + ", megaPixel=" + megaPixel + ", maxVideoResolution=" + maxVideoResolution
				+ "]";
	}

}

class Photo {
	String color; // black&white |full-color
	int height; // 750
	int width; // 450
	String paperType;// photo-paper, normal paper

	public Photo(String color, int height, int width, String paperType) {
		super();
		this.color = color;
		this.height = height;
		this.width = width;
		this.paperType = paperType;
	}

	@Override
	public String toString() {
		return "Photo [color=" + color + ", height=" + height + ", width=" + width + ", paperType=" + paperType + "]";
	}

}

class Photographer {
	String name;
	int photoClicked;
	String city;
	int age;

	public Photographer(String name, int photoClicked, String city, int age) {
		super();
		this.name = name;
		this.photoClicked = photoClicked;
		this.city = city;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Photographer [name=" + name + ", photoClicked=" + photoClicked + ", city=" + city + ", age=" + age
				+ "]";
	}

	void click1() {

	}

	void click2(int x) {

	}

	float click3(int x, int y) {
		return 0.0f;
	}

	String click4() {
		return "something";
	}

}

class PhotoScene
		{
			String type; //person |face | closeup | full | nature | it can be anything...
			String background;// curtain | mountain | wall | garden 
			String lightEffect; // cloudy | sunlight | moonlight | sunny | mixed
			
			public PhotoScene(String type, String background, String lightEffect) {
				super();
				this.type = type;
				this.background = background;
				this.lightEffect = lightEffect;
			}
			
			@Override
			public String toString() {
				return "PhotoScene [type=" + type + ", background=" + background + ", lightEffect=" + lightEffect + "]";
			}
			
			
			
			
		}

// Camera | Photo | Photographer (pakya)

/*
 * 
 * Passing Object as an argument to a function
 * 
 * and
 * 
 * Returning "Object" from a function as a return type(/value)
 * 
 * 
 * 
 * 
 */
}

}
