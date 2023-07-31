package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//ArrayLIst is a inbuilt class,dynsmic array ,its there in java already,its a dynamic array
		//size is not fixed and u can store diff types of data types
	
		ArrayList ar = new ArrayList();
		//raw type array list ,meaning u can store any type of data
		ar.add(100);
		ar.add("sandhya");
		ar.add(200);
		ar.add(300);
		ar.add(400);
		//size() is used in arraylist but length is used in Array
		System.out.println(ar.size());
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());
		//pc=7,vc=3(virtual capacity is for better memory management),it will not occupy any bytes
		System.out.println(ar.get(3));
		//System.out.println(ar.get(-3));//IOB -INdex out of bound
		//virtual capacity-default value of arraylist is 10,Physical capacity =0
		
		//current PC/2= new VC->load factor
		
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		
		//Generics->mention the type of data your storing in <>
		//du[licates are allowed in arraylist
		//order is maitained
		
		ar1.add(31);
		ar1.add(32);
		ar1.add(33);
		
		ArrayList<Double> ar2= new ArrayList<Double>();
		
		ar2.add(10.2);
		ar2.add(30.2);
		ar2.add(40.8);
		System.out.println(ar2);
		
		
		//use Object as generic to add all types of data types like int,string,double etc 
		
		ArrayList<Object> ar3 = new ArrayList<>();
		
		ar3.add("sandhya");
		ar3.add(33);
		ar3.add('f');
		ar3.add(12.40);
		ar3.add(true);
		
		System.out.println(ar3);
		
		System.out.println(ar3.remove(3));
		System.out.println(ar3);
		ar3.add(true);
		ar3.add(true);
		System.out.println(ar3);
		
		for(int i =0 ; i< ar3.size();i++) {
			System.out.println(ar3.get(i));
		}
		
		//for each
		System.out.println("____________-");
		
		for(Object e:ar3) {
			
			System.out.println(e);
			
			if(e.equals('f')) {
				System.out.println("hi");
				break;
				
			}
		}
		
		ArrayList<Integer> ar4= new ArrayList<Integer>();
		
		ar4.add(10);
		ar4.add(20);
		ar4.add(50);
		ar4.add(40);
		for (int e : ar4) {

			System.out.println(e);
		}
	}

}
