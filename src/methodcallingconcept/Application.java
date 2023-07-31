package methodcallingconcept;

public class Application {
	public void m1() {

		System.out.println("m1 method");
		m2();
	}

	public void m2() {

		System.out.println("m2 method");
		m3();
	}

	public void m3() {

		System.out.println("m3 method");

	}

	// Static
	public void t1() {

		System.out.println("t1 method");
		t2();
	}

	public void t2() {

		System.out.println("t2 method");
		t3();
	}

	public void t3() {

		System.out.println("t3 method");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
