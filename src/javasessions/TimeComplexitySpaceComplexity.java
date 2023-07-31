package javasessions;

public class TimeComplexitySpaceComplexity {

	public static void main(String[] args) {
		// time taken to execute the code(to determine the performance)
		
		//BIG O
		
		//Space complexity=Memory it is taking ,how much byte/bits its taking to run-denoted by BIG O
		
		int i=1;
		System.out.println(i);//timecomplexity is BIG O(1)-->for constant values
		
		String s="Selenium";
		
		//O(1)-->timecomplexity is one for constance
		
		//for loop 1-10
		
		//int j=1(execute only once)
		//j<=10 (execute 10 times say n times)
		//j++ 10 times(10times increments ,say n times)
		//SOP->10 times(say n times)
		
		//1+n+n+n= 3n+1=Linear Equation, dont consider 1 then it becomes 3n
		//O(3n)->O(n)
		
		
	
		for (int j = 1; j < 10; j++) {
			System.out.println(j);
		}
		
		int k=1;
		while (k<=100) {
			System.out.println(k);
			if(k==30) {
				
				System.out.println("hii");
			}
			k++;
		}
		
		//1+n+n+n+1+n->4n+2->2(2n+1)->4n->O(4n)->O(n)
		
		//nested fpr loop
		System.out.println("________________-");
		for(int m=0;m<=9;m++) {
			
			for(int n=0;n<=9;n++) {
				System.out.print(m+""+n+" ");
				
			}
		
			System.out.println();
	}
		
		//time complexity=mloop->(1+n+n+n)(1+n+n+n)->(1+3n)(1+3n)=1+3n+3n+9n*2 =1+6n+9n*2=Quadratic equation
		//simplify->6n+9n*2->3n(3n+2)=9n*2=O(n*2)
		
		// for 3 for loop->(n)(n)(n)=n*3+n*2+n+1->cubic 
		
		//Binary search
		//1 to 30
		//li-1
		//hi-29
		//15+15
		//15/2=7+8
		//8/2=4+4->4/2=2-->1+1
		//k=n/2
		//log k=log(n/2)
		//log(k)=log n- log2
		//log k =log n-1=log n(whenever you divide array by 2 then it tc will be log n)
		
		//why base 2(because we are dividing by 2)
		//divide by 3-->log with base 3
		
		
	}
}
