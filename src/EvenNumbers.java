
public class EvenNumbers {

	public static void main(String[] args) {
		//ODO Auto-generated method stub
	

		        int outer = 0; 
		        
		        System.out.println("Even numbers from 1 to 30:");

		        
		        while (outer < 3) {
		            int inner = 1; 
		            
		            while (inner <= 10) {
		                int currentNumber = (outer * 10) + inner;
		                
		                if (currentNumber % 2 == 0) {
		                    System.out.print(currentNumber + " ");
		                }
		                inner++; 
		            }
		            outer++; 
		        }
		    }
		
	}


