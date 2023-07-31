package exceptionHandling;

public class Student {

	public static int getStudentName(String StudentName) {
		System.out.println("getting marks for :" + StudentName);

		if (StudentName.equals("Shubam")) {

			try {
				int i = 9 / 3;
				System.exit(0);//shutdown the jvm,to avoid the finally block execution  we can use System.exit(0) in try catch
				return 45;// here it return 45 but after finally block it overwrite with 100.
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				return 85;// once its return immediately it return ,it will not go to next line
			} finally {
				return 100;// here it will return 100 ,it overwrite the previous 85 when it comes to
							// finally block.
			}

		} else if (StudentName.equals("Sapna")) {
			return 90;
		} else {
			System.out.println("student not found");
			return -1;
		}
	}

	public static void main(String[] args) {

		int m1 = Student.getStudentName("Shubam");
		System.out.println(m1);
	}

}
