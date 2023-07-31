package stringConcept;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "hello this is my java code and i am so happy";
		s1.length();

		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(37));
		// System.out.println(s1.charAt(38)); StringIndexOutOfboud Exception
		System.out.println(s1.indexOf("t"));
		System.out.println(s1.charAt(4));

		System.out.println(s1.indexOf("i"));// 1st occurrence of i
		System.out.println(s1.indexOf("i", 9));
		System.out.println(s1.indexOf("i", s1.indexOf("i") + 1));// 2nd occurence of i
		System.out.println(s1.indexOf("i", (s1.indexOf("i", s1.indexOf("i") + 1)) + 1));// 3rd occurencce
		System.out.println((s1.indexOf("i", (s1.indexOf("i", s1.indexOf("i") + 1)) + 1))+1);//4th occurence
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.indexOf("i")>0) {
				System.out.println(s1.indexOf("i"));
			
			}
			//count++;
//			else {
//				System.out.println("i is not found");
//			}
			
		}

		System.out.println(s1.indexOf("java"));// fetch J value
		System.out.println(s1.indexOf("cypress"));// -1--if value is not there then it gives -1

			String mesg ="welcome admin";
			if(mesg.indexOf("admin")>0) {
				System.out.println("admin is present");
			}
			else {
				System.out.println("Fail");
			}
			
			String mesg1 ="welcome null";
			if(mesg1.indexOf("admin")>0) {
				System.out.println("admin is present");
			}
			else {
				System.out.println("Fail");
			}
			//
			//trim
			String test=" selenium automation ";
			System.out.println(test.replace(" ", ""));//this removes all the spaces
			System.out.println(test.trim());//trim removes from corner
			
			//replace
			String dob="01-01-1990";
			String dob2= dob.replace("-", "/");//this creates in heap
			String dob3="01/01/1990";//this creates in SCP
			
			System.out.println(dob2==dob3);//false
//			
//			System.out.println(dod.replace("-", "/"));
//			
//			dod=dod.replace("-", "^");
			//System.out.println(dod);//here changed value stored in heap with new value
			
			
			String S1="JavaProgram";//SCP
			String S2="Java";//SCP
			String S3=S2+"Program";//Heap
			String S4="Java"+"Program";//SCP
			
			System.out.println(S1==S4);//true
			System.out.println(S1==S3);//false
			
			System.out.println("*****************");
			//touppercase/lowercase
			
			System.out.println(S1.toLowerCase());;
			System.out.println(S1.toUpperCase());;
			
			//substring
		String mg = "Your User name is sandhya";

		System.out.println(mg.substring(7));
		System.out.println(mg.substring(0, 7));// lastindex -1
		System.out.println(mg.substring(mg.indexOf("is") + 3, mg.length()));

		// contains
		String g = "YOur User name is sandhya";
		System.out.println(g.contains("sandhya"));
		if (g.contains("sandhya")) {
			System.out.println("Pass");
		}

		// equals:
		String p1 = "Hello Selenium";
		String p2 = "Hello selenium";
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equalsIgnoreCase(p2));

		// split--return type is String[]
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String lg[] = lang.split("_");
		System.out.println(lg[2]);
		System.out.println(Arrays.toString(lg));
		
		//
		String top ="xXtestingXxXSeleniumXXxXAutomationxXXCpress";
		String tp[]=top.split("xX");
		
		System.out.println(tp[0]);
		System.out.println(tp[0].length());
		System.out.println(tp[1]);
		System.out.println(tp[2]);
		System.out.println(tp[3]);
		System.out.println(tp[4]);
		//System.out.println(tp[5]);//AIOB
		
		String mg1 = "Your User name is sandhya";
		String m=mg1.split("is")[1].trim();//here mg1.split gives array from that array fetching first values and trim it 
		System.out.println(m);
		
		String empData="Mitaj;Automation;Pune;India;32232;SDET;123,22";
		
		String emp[]=empData.split(";");
		
		for(String e:emp) {
			System.out.println(e);
		}
		//here | is used as reg expression.so to make it as normal separator put one \\
		String empData1="Sagar|Automation|Pune|India|32232|SDET|123,22";
		String e[]=empData1.split("\\|");
		System.out.println(e[0]);
		
		//to print "Java" use escape character,put \ before "
		String d1 = "I Love \"Java\" and I am so Happy";
		System.out.println(d1);
		
		
		//
		createXpath("sanya");
		
	}
	public static void createXpath(String empName) {
		String xpath= 	"[//a[text()='"+empName+"']";
		System.out.println(xpath);
	}

}
