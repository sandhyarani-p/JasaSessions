package assignments;

public class PrintSeries {

	public static void main(String[] args) {
		// 9. Print the following series: 

		//1.0 2.0 3.0  ...... 10.0 

		//0 9 18 27 36 …99
		
		for (double i = 1.0; i <=10.0 ; i++) { 	
			
			System.out.println(i);
			
		}
		
		System.out.println("**************");
		//0 9 18 27 36 …99
		
	for(int j=0;j<=99;j++) {
		//System.out.println(j);
		if(j%9 == 0) {
			System.out.println(j);
	}

	}}

}
