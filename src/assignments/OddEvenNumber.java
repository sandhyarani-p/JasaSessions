package assignments;

public class OddEvenNumber {

	public static void main(String[] args) {

//		int a=15;
//		
//		int num = 2;
//		
//		if(a%num == 0) {
//			System.out.println(a +" "+"is a even number");
//		}
//		else {
//			
//			System.out.println(a +"is an odd number");
//		}

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " " + "Its an even number");
			} else {
				System.out.println(i + " " + "Its an odd number");
			}

		}

		System.out.println("do while**********8");
		// do while

		int l = 1;
		do {
			if (l % 2 == 0) {
				System.out.println(l + "even number");
			} else {
				System.out.println(l + "odd number");
			}
			l++;
		} while (l <= 100);

		//
		System.out.println("even numbe using for loop");

		for (int p = 2; p <= 100; p = p + 2) {

			System.out.println(p);
		}

		System.out.println("odd numbe using for loop");

		for (int p = 1; p <= 100; p = p + 2) {

			System.out.println(p);
		}
	}

}
