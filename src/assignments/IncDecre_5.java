package assignments;

public class IncDecre_5 {

	public static void main(String[] args) {
		int i=1, j=2, k=3;



		int m = i-- - j-- - k--;
		
		//1(0) - 2(1) -3(2)=-4

		

	System.out.println("i="+i);//0

	System.out.println("j="+j);//1

	System.out.println("k="+k);//2
    System.out.println("m="+m);//-4
    
    int a=1, b=2;
    System.out.println(--b - ++a + ++b - --a);
    //1(1)-2(2)+2(2)-1(1)=0
    
    int i1=19, j1=29, k1;

  

    k1 = i1-- - i1++ + --j1 - ++j1 + --i1 - j1-- + ++i1 - j1++;
    //19(18)-18(19)+28(28)-29(29)+18-29(28)+19-28(29)
    //19-18+28-29+18-29+19-28

    
	System.out.println("i="+i1);//19

    System.out.println("j="+j1);//29

    System.out.println("k="+k1);//-20

  

    

	}

}
