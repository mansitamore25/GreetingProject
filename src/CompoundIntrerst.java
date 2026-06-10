     import java.util.Scanner;
public class CompoundIntrerst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		
		System.out.println("Enter principal Amount : ");
		int principal=scanner1.nextInt();
		
		System.out.println("Enter rate : ");
		float rate=scanner2.nextFloat();
		
		System.out.println("Enter time : ");
		int time=scanner3.nextInt();
		
		double main= 1 + (rate / 100) /principal;
				
		double power=principal*time;
		
		double result= principal * Math.pow(main, power);
		
		
		System.out.println("Total Compound Interest : "+ result  );
		
	}
	

}
