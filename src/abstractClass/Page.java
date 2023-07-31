package abstractClass;

public abstract class Page {

	//variables are normal,not static/final
	int loadingTime=10;
	//always parent constructor is called first in case of constructor
	
	public Page() {
		this(5);
		System.out.println("this is my page constructor");
	}
	
	public Page(int a) {
		System.out.println("this is my page constructor-param"+ a);
	}
	//can not create object for abstract class
	//can i create a constructor of the abstract class??--Yes
	//this constructor will be called when we create object of child class
	
	//no abstract methods--0% abstraction
	
	//all abstract method--100% abstraction
	
	//partial abstraction - both abstract/non abstract method
	
	
	public abstract void title();
	
	public abstract void url();
	
	
	public void dafaultPageTimeOut() {
		System.out.println("page--TimeOut-20sec");
	}
	
	public void search() {
		
	}
	
	
	public static void displayfooters() {
		System.out.println("page--displayfooters");
	}
	
	public final void displayLogo() {
		System.out.println("page--displayLogo");
	}
}
