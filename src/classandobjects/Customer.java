package classandobjects;

public class Customer {

	
	String name;
	int age;
	
	//Var--class variable
			//method/function--are used to define business logic/feature/implementation
			//cannot create method inside another method but can call a method from another method
			//object has the copy of method and data members
			//methods are independent or parallel to each other
			
			//types of method
			//1.method with no return type or no input
			//method name should start with small letter later camel case
	
	public void test() {// 0 parameter
		System.out.println("test method");
		int i=10;
		System.out.println(i);
		
	}
	
	//2.no input,return something
	public int sum() {
		System.out.println("sum method");
		int a=10;
		int b=20;
		int c= a+b;
		return c;
		
	}
	
	public String getTrainerName() {
		
		System.out.println("Getting the trainer from NAL");
		String name="Naveen";
		return name;
		
		//return should be the last statement of the function
	}
	
	
	// we can have return directly as number but not a good practice
	public int getNumber() {
		System.out.println("getting number");
		return 100;
	}
	
	//3.some return with input parameter
	//return type is int(2 parameters),here a,b are input parameters
	public int add(int a,int b) {
		
		System.out.println("adding two numbers ");
		
		int z=a+b;
		
		return z;
		
		
	}
	
	public int multiply(int a,int b) {
		System.out.println("multiplying 2 numbers");
		int z = a*b;
		return z;
		}
	
	//here one mistake is tht there are 3 parameters but only 2 param are using
	//so if your passing parameter use it or dont pass it
	public double getTotalMarks(double score,int handWriting,int attendscore) {
		
		double finascore =score+handWriting+attendscore;
		
		return finascore;
	}
	
	//method with no return value jsut the return key word--this is eqaul to no return /void method
	public void getUrl() {
		
		System.out.println("method with no return value jsut the return key word");
		return;
	}
	
	
	//to access these class variables/methods need to create object
	public static void main(String[] args) {
		//create the object of the class
		System.out.println("Inside the main method");
		Customer c1 = new Customer();
		
		c1.name="tom";
		c1.age=29;
		c1.test();
		c1.test();
		int m1 =c1.sum();
		System.out.println(m1);
		//return will help in performing additional logic
		System.out.println(m1-5);
		String trName = c1.getTrainerName();
		System.out.println(trName +" "+"for java and selenium");
		
		if(trName.equals("Naveen")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("Fail");
		}
		
		System.out.println(c1.getNumber());//not a good practice to call function in sop

		 int m2= c1.getNumber();
		 System.out.println(m2+5);
		 
		// System.out.println(c1.test());//this is not allowed,fucntion with void .inside sop
		 //here 10,20 are arguments-in the calling function
		int sum=c1.add(20, 20);//values-- Arguments
		System.out.println(sum);
		
		 sum=c1.add(230, 20);//values-- Arguments
		 System.out.println(sum);
		
		 int mul =c1.multiply(2, 3);
		 System.out.println(mul);
		double score =c1.getTotalMarks(90, -5, -10);
		System.out.println(score);
	}

}
