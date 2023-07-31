package stringConcept;

public class StringTest {

	public static void main(String[] args) {
		String s= "testing";//String literals
		
		String s1= new String("testing");
		
		String s2="testing";
		
		System.out.println(s==s1);//ref comparision
		
		System.out.println(s==s2);
		
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s1));
		
		String s3="Java";
		s3=null;
		System.out.println(s3);
		
		String s4="Java";
		String s5="Java";
		
		String s6 = new String("testing");//creates new String Object
		//when u create string object with new keyword,doesnt matter values alreay there or not it creates new object with same value.
		
		String t1="Selenium";
		String t2=new String("Selenium");
		t2.intern();//SCP--1,this creates one object inside the SCP-constant pool without reference in
		
		String t3="Selenium"; 
		//
		String top="Naveen";
		String top1="Naveen";
		String top3=new String ("Naveen");
		top=null;
		top1=null;
		String top4="Naveen";
		
		System.out.println(top=top1);
		//System.out.println(top.equals(top1));  you cant compare null with null,gives NPE
		
		System.out.println(top4==top3);
		System.out.println(top4.equals(top3));
		
		//
		String p1 = new String("Cypress");
		p1.intern();
		
		//
		String z="testing";//inside SCP
		z.concat("automation");
		
		System.out.println(z);//it will not concatenate,it will not make any changes in existing value,it will create new value in heap refereed by no one
		//String are immutable,original value cant change
		z =z.concat("automation");
		System.out.println(z);//here z1 has new value but z still have testing only
		
		String z1="testing";
		System.out.println(z1);
		
		//
		String r = "   Cypress  ";
		//r=r.trim();// this will make another value which is modified without space in heap
		System.out.println(r.trim());
		System.out.println(r);///still give with space 
		
		//String manupulation is not allowed as its allowed
		
	//manupulation creates new value 
		//for the String manupulation,therre are 2 class String buffer and String BUilder--Mutables
		
		
		//String BUffer-JDK 1.0/Thread safe/slower/only one therad works at a time
		//String Builder-JDK1.5/not Thread safe/faster/multiple thread works at the same time
		
		//no String buffer/BUilder literals
		
		StringBuffer sb = new StringBuffer("naveen");
		System.out.println(sb);
		sb.append("Testinglab");
		System.out.println(sb);
		
		StringBuilder sb1 = new StringBuilder("naveen");
		System.out.println(sb1);
		sb1.append("Testinglab");
		System.out.println(sb1);
		
		//StringBuilder is faster
		
		
		
		
		
			
		
		
		
		
		
		

	}

}
