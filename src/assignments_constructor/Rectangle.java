package assignments_constructor;

public class Rectangle {

	
	double length;
	double width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}

	
	public double calculateArea(double length,double width) {
		
		double  area = length*width;
		return area;
	}
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.length+" "+r1.width);
		double r1area=r1.calculateArea(20, 5);
		System.out.println("param constructor"+r1area);
		
		
		Rectangle rec = new Rectangle(12, 20);
		System.out.println(rec.length +" "+rec.width);
		
		double rectaglearea=rec.calculateArea(10, 20);
		System.out.println("Area of the rectangle is "+rectaglearea);

	}

}
