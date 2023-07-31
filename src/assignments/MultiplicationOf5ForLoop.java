package assignments;

public class MultiplicationOf5ForLoop {

	public static void main(String[] args) {
             //int k=5;
		
		for(int p=1;p<=100;p++) {
			//System.out.println(k * p);
			//System.out.println(p);
			if(p%5==0) {
				System.out.println(p);
		
			}
		
	}
		
//		double d = 1.9;
//		double d2=2.0;
//		System.out.println(d+d2);
		
		//Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i%7 == 0) {
				
				System.out.println("bye, see you tomorrow");
				break;
			}
		}
		

}
}