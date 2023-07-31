package assignments;

public class ReverseString {

	public static void main(String[] args) {
	    String st="ABCD";
		
		String rev="";
		
		for(int i=st.length()-1;i>=0;i--) {
			
			rev=rev+st.charAt(i);
			
		}
		System.out.println(rev);
		
		int a[]= {2,1,3,5,6};
		
		int max=a[0];
		
		
		for(int j=0;j<a.length;j++) {
			
			if(a[j]>max) {
				max=a[j];
				
			}
			
		}System.out.println(max);
	}
	
	
	

}
