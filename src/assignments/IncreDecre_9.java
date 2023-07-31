package assignments;

public class IncreDecre_9 {

	public static void main(String[] args) {
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--;
		
		//-1*-1*-1(-2)*-1(-2)=1
		System.out.println(p);//1
		System.out.println(m);//-2
		System.out.println(n);//-2
		
		int a=1;
		a = a++ + ++a * --a - a--;
		
		
		//  1(2)+3 * 2(2) - 2(1)
		
//		///1+3 * 2-2=1+6-2=5
		System.out.println(a);//5
		//What will be the outcome of the below program?
		//int a1 = 11++;
		
		//compilation error because increment/decrement operator cant be used on numeric values.
		
		//System.out.println(a1);

		
		int ch='A';
		 System.out.println(ch++);
		 //it prints the ascii value of 'A' -->65(println consumes ch value then it will increment and store in memory 66
		 
		 System.out.println(ch);//here it will be increment value 66
	

		 int ch1='A';
		 System.out.println(++ch1);
		 //66is the output
		

		
	}

}
