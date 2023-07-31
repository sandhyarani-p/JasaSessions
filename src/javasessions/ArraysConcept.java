package javasessions;

public class ArraysConcept {

	public static void main(String[] args) {
	 int a[]= {1,2,3,4};
	 
	 //static array->where size is fixed,you cannot go beyond the size of the array
	 //it can store only similar types of data
	 
	 //real time usecase for staticarray->flight booking,days of month,red bus ,movie tickets
	 
	 //Dynamic array->size is variable-> uber booking,amazon products
	 
	int b= a.length;
	
	System.out.println(b);
	
	int a1[] = new int[4];
	//a1[-1]=11;//AIOB
	a1[0]=10;
	a1[1]=20;
	a1[2]=30;
	a1[3]=40;
	//a1[4]=50;
	
	//System.out.println(a1[4]);//-->AIOB
	//System.out.println(a1[-1]);//-->AIOB
	for (int i = 0; i < a1.length; i++) {
		
		System.out.println(a1[i]);
		
	}
	
	
	
	

	}

}
