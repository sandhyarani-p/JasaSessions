package assignments;

public class PrintVowels {

	public static void main(String[] args) {
		// Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
		
		for (char i = 'a'; i <= 'z'; i++) {
			
			//System.out.println(i);
			
			if(i=='a' || i =='e' || i == 'i' || i == 'o' || i =='u') {
				
				System.out.println("vowel"+ " " +i);
			}
			

			
			//while loop
			
			System.out.println("while loop***********");
			char j ='a';
			while (j <= 'z') {
				
				if(j=='a' || j =='e' || j == 'i' || j == 'o' || j =='u') {
					System.out.println("vowel"+ " " +j);
				
			}
				j++;
				
	}
			
		

}}}
