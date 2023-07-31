package classandobjects;

public class Student {

	
	//class vars/template variables
	//dont declare the values to class variables
	
	String name;
	int marks;
	char grade;
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name="sandhya";
		s1.marks=90;
		s1.grade='A';
		
		Student s2 = new Student();
		s2.name="sanvi";
		s2.marks=95;
		s2.grade='A';
		
		Student s3 = new Student();
		s3.name="anitha";
		s3.marks=60;
		s3.grade='C';
		
		System.out.println(s1.name + " "+s1.marks +" "+s1.grade);
		System.out.println(s2.name + " "+s2.marks +" "+s2.grade);
		System.out.println(s3.name + " "+s3.marks +" "+s3.grade);
		
		//no ref object
		//not advisible 
		new Student();//creates one object
		new Student().name="Aman";//creates another object
		new Student().marks=60;//creates one another object
		
		
		//just the ref name without the object
		Student s4;
		s4= new Student();
		s4.name="Tesla";
		
		//null reference object
		//not a good practice to  create such type of objects
		Student  s5 = new Student();
		s5=null;
		
		s5.name="Peter";// you get null pointer  ,you cant read null.name so NPE
		System.out.println(s5);
		
		//Garbage collector will destroy no ref / null reference objects,GC depends on JVM
		System.gc();//to destroy the no ref/null ref objects
		
		//deallocation of memory is done by System.gc()
		
	}

}
