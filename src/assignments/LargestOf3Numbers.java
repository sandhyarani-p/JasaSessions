package assignments;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// Conditional Operators:

//Find out the greatest number out of three different given numbers:

//Input the 1st number: 25 

//Input the 2nd number: 78 

//Input the 3rd number: 87
		
		int a = 25, b = 78, c = 87;
		
		
		if(a>b && a>c) {
			System.out.println("a is largest" + a);
		}
		else if(b>a && b>c) {
			System.out.println("B islargest" + b);
		}
		else {
			System.out.println("c is the largest"+ c);
		}



	}

}
