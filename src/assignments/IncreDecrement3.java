package assignments;

public class IncreDecrement3 {

	public static void main(String[] args) {
		
		
		int i=0;
		i = i++ - --i + ++i - i--;
		
		//0(1) _ 0 +1 - 1
		System.out.println(i);//0

	}

}
