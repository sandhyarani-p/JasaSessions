package assignments;

public class LoopAscii {

	public static void main(String[] args) {
		// Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.

		//A-Z()65-91
		for (char i ='A'; i <='Z' ; i++) {
			
			System.out.println((int)i +" " +i);
		}
		
		
		System.out.println("a-z Ascii");
		
		for (char i = 'a'; i <= 'z'; i++) {

			System.out.println((int) i + " " + i);
		}
		
		for (char i = '0'; i <= '9'; i++) {

			System.out.println((int) i + " " + i);
		}
		
		System.out.println("*************************");
		
		//while loop
		
		char s='A';
		
		while (s<='Z') {
			
			System.out.println((int)s +" "+s);
			
			s++;
			
		}
		
		//a-z
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		
	char s1='a';
		
		while (s1<='z') {
			
			System.out.println((int)s1 +" "+s1);
			
			s1++;
			
		}

		System.out.println("$$$$$$$$$$$$$$$$$");
		
		char s2 = '0';

		while (s2 <= '9') {

			System.out.println((int) s2 + " " + s2);

			s2++;

		}
		
	}

}
