package assignments;

import java.util.Arrays;

public class AraayStatic {

	public static void main(String[] args) {
		// Write a program to create a static Array, having following cricket data:
//		--name, age, team name, DOB, gender, Strike Rate
//
//		                        --Try to create multiple Object Arrays for different players 
//
//		                        --Try to print all the values of each player on the console
		
		
		Object[] obj1 = new Object[6];
		
		obj1[0]="KL Rahul";
		obj1[1]=28;
		obj1[2]="RCB";
		obj1[3]= 12-03-2003;
		obj1[4]='m';
		obj1[5]=100.1;
		
		
		Object[] obj2 = new Object[6];

		obj2[0] = "Dravid";
		obj2[1] = 38;
		obj2[2] = "RCB";
		obj2[3] = 18 - 03 - 1990;
		obj2[4] = 'm';
		obj2[5] = 130.1;
		
		Object[] obj3 = new Object[6];

		obj3[0] = "Ganguly";
		obj3[1] = 38;
		obj3[2] = "RCB";
		obj3[3] = 19 - 03 - 1985;
		obj3[4] = 'm';
		obj3[5] = 132.1;
		
		
		for (int i = 0; i < obj1.length; i++) {
			System.out.println(obj1[i]);
			
		}
		for (int i = 0; i < obj2.length; i++) {
			System.out.println(obj2[i]);
			
		}
		
//		for (int i = 0; i < obj3.length; i++) {
//			System.out.println(obj3[i]);
//			
//		}
		//using for each loop
		for (Object e : obj3) {
			System.out.println(e);
		}

	//WAP to delete a specific number from the given array.
		
		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2,2 };

		System.out.println(Arrays.toString(p));
		
		// Write a Java program to update specific array element by given element.
		
		p[4]=199;
		System.out.println(Arrays.toString(p));
		
	}

}
