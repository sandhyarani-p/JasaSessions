package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> emp = new  ArrayList<String>(20);
		
		//Here VC is increased to 20 explicitly,we can change the VC explicitly by defining here
		
		
		ArrayList<Integer> markslist = new  ArrayList<Integer>();
		markslist.add(1);
		markslist.add(2);
		markslist.add(3);
		markslist.add(4);
		markslist.add(5);
	    markslist.remove((Object)2);
		System.out.println(markslist);
		
		markslist.set(1, 33);
		System.out.println(markslist);
		
		//ArrayList Literals
		
		ArrayList<String> browserlist = new ArrayList<String>(Arrays.asList("chrome","edge","firefox"));
		System.out.println(browserlist);
		System.out.println(browserlist.size());
		
		System.out.println(browserlist.get(1));
		
		for(String e:browserlist) {
			System.out.println(e);
		}
		
		
		ArrayList<String> emplist = new ArrayList<String>(Arrays.asList("Tom","Peter","Sagar","Ravi","Shubam"));
		
		System.out.println(emplist);//normal list
		
		//Collections.reverse(emplist);//reversedlist
		//System.out.println(emplist);
		
		for(String e : emplist) {
			System.out.println(e);
		}
		
System.out.println("*************");
		//using for loop
		
		for(int j=emplist.size()-1;j>=0;j--) {
			System.out.println(emplist.get(j));
		}
		
		//Array to ArrayList
		
		//whenever you convert Array to Arraylist use non primitive types
		
		//int num[]= {1,2,3,4,5,6};// not like this
		
		Integer num[]= {1,2,3,4,5,6};//use like this 
		
	   List<Integer>   numberlist=Arrays.asList(num);
		
		System.out.println(numberlist.size());
		
		
		//
		ArrayList<String> list = new ArrayList<String>() {
			{
			
			add("Java");
			add("Python");
			add("Ruby");
			}
		};
		
		System.out.println(list.size());
		
		list.add("Javascript");
		System.out.println(list.size());
		
		//ArrayList is child of List Interface
		List<Integer> nlist=List.of(1,2,3,4,5);
		System.out.println(nlist.size());
	//	nlist.add(6); here you get exception unsupported operation because List.Of you cant add more elements
		//its a Immutablecollection
		//System.out.println(nlist.size());
		//nlist.remove(1);//exception due to immutability,you cant add/remove elements
		//Immutable list->u cant change the list,this is added under JDK 1.9
		
		ArrayList<String> months= new ArrayList<String>();//VC=10,PC=0
		
		months.add("JAN");
		months.add("FEB");
		months.add("March");
		months.add("April");
		months.add("MAY");
		months.add("JUNE");
		//vc=4,pc=6
		
		months.trimToSize();//trim the VC to current PC
		//VC=6 PC=6
		//to change the VC to make better memory management
		//when we try to add July new VC gets added -->VC=PC/2=6/2=3
		
		
		months.add(0, "month");
		months.add("JULY");
		
		System.out.println(months);
		//months.add(10, "month1"); give IOB because memory is continous allocation 
		
		Collections.swap(months, 1, 0);
		
		System.out.println(months);
		
		List<Object> ls=Collections.emptyList();
		System.out.println(ls.size());
		
		Collections.sort(months);
		
		System.out.println(months);
		
		//to add element at the mid index
		ArrayList<Integer> number = new ArrayList<Integer>();
	
		
		number.add(3);
		number.add(5);
		number.add(7);
		number.add(1);
		number.add(17);
		number.add(15);
		
		int mid = number.size()/2;
		
		number.add(mid, 44);
		System.out.println(number);
		
		
		
		
	}

}
