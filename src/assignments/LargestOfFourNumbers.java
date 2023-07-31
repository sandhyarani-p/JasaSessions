package assignments;

public class LargestOfFourNumbers {

	public static void main(String[] args) {
		//Find out the greatest number out of four different given numbers
		
		int a= 97;
		int b= 78;
		int c = 25;
		int d = 87;
		
		if(a>b && a>c && a>d) {
			System.out.println("Largest number is " +""+ a);
		}
		else if(b>a && b>c && b>d) {
			System.out.println("Largest number is " +""+ b);
		}
		else if (c>a && c>b && c>d) {
			System.out.println("Largest number is " +""+ c);
		}
		else {
			System.out.println("Largest number is " +""+ d);
		}
		

	}

}
