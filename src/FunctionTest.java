
public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

class Teacher
{
	//1. function without argument AND without return type
	void Distributethebooks()
	{
		System.out.println("The Teacher called me to distribute the books to everyone");
	}
	void Assignment() {
		System.out.println("Teacher told us to do the assigment together");
	}
	
	
	
	//2. function WITH argument BUT without return type"
	void gotoThatClassRoom(int x) {
		System.out.println("Going to the classroom : "+x+" standard....");
	}
	
	void gotoTheLibrary(int booksCount) {
		System.out.println("Going to the library with...."+booksCount+" books");
	}
	
	
	
	
	
	//3. function WITH argument AND WITH return type
	String gotoCanteen(int rupees) {
		System.out.println("going to canteen to purchase some snacks....of rupees.."+rupees);
		return "Pizza";
	}
	
	float gotoAccountsOffice(int studentCount) {
		System.out.println("Going to the account office to pay fees ...of "+studentCount+" students...");
		return 3000 * studentCount;
	}
	
	
	
	//4. function without argument BUT WITH return type
	String gotoPrincipal() {
		System.out.println("Going to principal cabin..and coming with a message from them...");
		return "Do Come In Uniform";
	}
	
	float gotoTheGround() {
		System.out.println("Gone to the ground to see the temperature.....");
		return 44.3f; // 44.3 is not a good temperature during the summer....
	}
}


public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.Distributethebooks();
		System.out.println("-------------");
		teacher.gotoThatClassRoom(7);
		teacher.gotoThatClassRoom(9);
		teacher.gotoThatClassRoom(10);
		System.out.println("-------------");

		//return value    =   invoke the function with parameter 50
		String str = teacher.gotoCanteen(150);
		System.out.println("Item bought for sir is : "+str);
		System.out.println("-------------");

		String mesg = teacher.gotoPrincipal();
		System.out.println("Message : "+mesg);
		
		System.out.println("====================");
		teacher.Assignment();
		
		teacher.gotoTheLibrary(4);

		float totalFeesDeposited = teacher.gotoAccountsOffice(15);
		System.out.println("Total fees :" +totalFeesDeposited);;
		
		float temp = teacher.gotoTheGround();
		System.out.println("Temperature is : "+temp);
		
	}
	/*
	public static  void findCube1() {
		System.out.println("1. function without argument AND without return type");
	}
	public static  void findCube2(int x) {
		System.out.println("2. function WITH argument BUT without return type");
	}
	public static  float findCube3(int x) {
		System.out.println("3. function WITH argument AND WITH return type");
		return 0.0f;
	}
	public static  float findCube4() {
		System.out.println("4. function without argument BUT WITH return type");
		return 0.0f;
	}
	*/
	
}




/*

Function = set of instructions to do specific activity


		returnType	functionName(arguments/parameters)
		{
				body of the function
				
				return statement
		}

*/
	}

}
