package dataconversion;

public class DataConversion {

	public static void main(String[] args) {
		String x = "100";

		System.out.println(x + 20);

		// String to int
		// using wrapper class
		// for the primitive to non primitive wrappers-under that hold the primitive
		// values

		// int-Integer
		// double--Double
		// float-Float
		// char--Character
		// boolean--Boolean

		// String to int

		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// this is not allowed only numerics are allowed
//		String test="100A";
//		int k=Integer.parseInt(test);//numberformat exception
//		System.out.println(k);

		// Sting to double
		String dl = "12.33";
		double d = Double.parseDouble(dl);
		System.out.println(d + 4);

		// String to boolean
		String headless = "true";
		if (Boolean.parseBoolean(headless)) {
			System.out.println("boolean wrapper");
		}
		boolean bool = Boolean.parseBoolean(headless);
		System.out.println(bool);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		//int to string
		int a= 100;
		System.out.println(a+20);//120
		
		String va=String.valueOf(a);
		System.out.println(va+20);

	}

}
