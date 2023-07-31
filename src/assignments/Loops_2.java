package assignments;

public class Loops_2 {

	public static void main(String[] args) {
		// do-while loop
		
		//WAP to print 10 to 1
		int i=1;
		do {
			System.out.println(i);
			i++;
			
			
		} while (i<=10);

		
		//multiplication of 5 using do while
		
		int k = 1;
		do {
			if (k % 5 == 0) {
				System.out.println(k);

			}
			k++;

		} while (k <= 100);
		

		//multiplication of 5 using while
		System.out.println("WHile loop**********");
		
		int j=1;
		while(j<=100) {
			
			if(j%5==0) {System.out.println(j);
			}
			j++;
			
		}
		
		//for loop
		
		
		System.out.println("for loop&&&&&&&&&&&&");
		
		for (int j2 = 1; j2 <= 100; j2++) {
			System.out.println(j2);
			if(j2%5==0) {
				System.out.println("hello");
			}
			
		}
	}
	

}
