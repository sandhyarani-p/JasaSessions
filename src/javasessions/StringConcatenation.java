package javasessions;

import java.util.Iterator;

public class StringConcatenation {

	public static void main(String[] args) {
		
		
		int a=30;
		int b =20;
		
		System.out.println(a+b);
		
		System.out.println(20+10);
		
		String a1="test1";
		
		String b1="test2";
		
		//test1test23020
		System.out.println(a1+b1+a+b);
		
		//System.out.println();
		
		char c='a';
		
		char d='d';
		
		System.out.println(a1+b1+(c+d));
		
		byte b11=100;
		byte b12=30;
		byte b3=(byte) (b11+b12);//Range->-128 to 127-->130-256=-126
		
		System.out.println(b3);
		
		System.out.println(9/2);
		
		System.out.println(9.0/2.0);
		
		System.out.println(9/2.0);
		
		System.out.println(9/2f);
		System.out.println(9f/2);
		
		System.out.println(9f/3f);//3.0
		
		//System.out.println(1/0);AE
		System.out.println(1.0/0);//any decimal/zero is Infinity
		System.out.println(1/0.0);//Infinity
		System.out.println(0.0/0.0);//NaN-->Not A Number
		System.out.println(0/0.0);//NaN-->Not A Number
		System.out.println(0.0/0);//NaN-->Not A Number
	
		
		
		
		
		
		
		
		
		
		
	}

}
