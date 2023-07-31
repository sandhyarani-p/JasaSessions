package assignments_string;

import java.util.Arrays;

public class SplitPrint {

	public static void main(String[] args) {
		String mg1 = "name:sandhya:bangalore:age23";
		String user[]=mg1.split(":");//split gives array return
		
		System.out.println(Arrays.toString(user));
		
		for(String e:user) {
			System.out.println(e);
		}

	}

}
