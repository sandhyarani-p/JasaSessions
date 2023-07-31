package assignments;

public class MethodsAssignement {
	
	
	// Write a program to print the addition/subtraction/division/multiplication
			//of two numbers entered by user by defining your own method

	public int add(int a,int b) {
		
		int z=a+b;
		return z;
	}
	
	public int sub(int a, int b) {

		int z = a - b;
		return z;
	}
	
	public int multiply(int a, int b) {

		int z = a * b;
		return z;
	}
	
	public static void main(String[] args) {
		
		MethodsAssignement m1 = new MethodsAssignement();
		
		int sum=m1.add(5, 60);
		System.out.println(sum);
		
		int sub = m1.sub(10, 6);
		System.out.println(sub);
		
		int mul = m1.multiply(9, 6);
		System.out.println(mul);
		

	}

}
