package assignments;

public class ComputeExpression {

	public static void main(String[] args) {
	
		//4. Write a Java program to compute the specified expressions and print the output. Go to the editor

		//Test Data:

		//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 

		//Expected Output

		//2.138888888888889
		
		System.out.println();
		
		double f= 25.5;
		double g=3.5;
		double h=40.5,i=4.5;
		
		double k=(f*g-g*g)/(h-i);
		
		System.out.println(k);
	

	}

}
