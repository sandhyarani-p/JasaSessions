package assignments;

public class PrintEvenOddUpto100 {

	public static void main(String[] args) {
		//print all odd and even numbers between 1 to 100
		
		int i=1;
		
		while(i<=100) {
			if(i%2==0) {
			System.out.println(i+"even number");
			}
			else {
				System.out.println(i+"odd number");
			}
			i++;
		}
		

	}

}
