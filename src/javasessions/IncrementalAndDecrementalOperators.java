package javasessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		
		
		//Post Increment:Assign the value first then increment,in the below case,initially a is 1 then line 10,
		//1 will be assigned to b first then increment by 1 so,it will become 2 and store the latest 2 to a
		int a= 1;
		int b= a--;
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c=10;
		int d=c++;
		
		System.out.println(c);//c 11
		System.out.println(d);//d 10-->line 17-->c will be assigned to d first (10) then increment by 1 and latest value 11 will be stored in c. 
		
		int f=-99;
		int g= f++;
		
		System.out.println(f);//-98
		System.out.println(g);//-99
		
		
		double d11=1.1;
		double d21=d11++;
		
		System.out.println(d11);//2.1
		System.out.println(d21);//1.1
		
		//Pre Increment :first increase the value and then assign 
		
		//trick(both the variables have the same value in case of pre increment.
		
		int x= 1;
		int y= ++x;
		
		System.out.println(x);//2 ->first x value increased given to y then same will be stored in x   
		System.out.println(y);//2
		
		int t1=-999;
		int t2= ++t1;
		
		System.out.println(t1);//-998
		System.out.println(t2);//-998
		
		double d1=1.1;
		double d2=++d1;
		
		System.out.println(d1);//2.1
		System.out.println(d2);//2.1
		
		
		char c1= 'a';//ASCII value of 'a' is 97
		char c2=++c1;//increment by 1 i.e.,b=98 (ASCII)then assign by converting to normal characters accordingly a,b etc
		
		System.out.println(c1);//b
		System.out.println(c2);//b
		
		//Post Decrement-->Assign the value first and then decrement and store
		
		int p=2;
		int q=p--;
		
		System.out.println(p);//1
		System.out.println(q);//2
		
		int u1=10;
		int u2= u1--;
		
		System.out.println(u1);//9
		System.out.println(u2);//10
		
		int p1= -99;
		int p2= p1--;
		
		System.out.println(p1);//-100
		System.out.println(p2);//-99
		
		int p11= -90;
		int p12= p11--;
		
		System.out.println(p11);//-90-1=-91
		System.out.println(p12);//-90
		
		
		//Pre Decrement
		//First decrement the value then assign
		
		int h1=2;
		int h2=--h1;
		
		System.out.println(h1);//1
		System.out.println(h2);//1
		
		int v1=-96;
		int v2=--v1;
		
		System.out.println(v1);//-97
		System.out.println(v2);//-97
		
		
		//special case
		
		int test=5;
		System.out.println(test++);// 5->first test value will be consumed by println to print then in the second print case increment 
		  							//and assign to test
		System.out.println(test);//here it will be 6(post incremented value will be stored in test)
		
		int pop=8;
		System.out.println(pop++);//8
		System.out.println(pop);//9
		
		//
		char ch='0';// ASCII value of 0 is 48
		System.out.println(++ch);//increment first ,which is 49 then put it back to actual from ascii i.e.,1
		
		System.out.println(ch);//1
		
		
		char ch1='$';
		System.out.println(++ch1);//ASCII value of $ is 37 ,increment to 38=%
		
		char ch2='a';//97
		System.out.println(ch2++);//a
		System.out.println(ch2);//b
		
		//boolean is not part of incremet/decrement operator.
		
		
		int e1=2;
		int e2= e1++ + ++e1;
		
		System.out.println(e1);//4(e1++ + ++e1->assign e1 value i.e, 2  then increment (in memory its 3) + ++e1-->here increment first ->meani)
		//in memory increment to 4,so 2+4=6 is given to e2 and latest value for e1 in memory is 4
		System.out.println(e2);//6
		
		int l1=2;
		int l2=l1++ - l1++ + l1--;
		System.out.println(l1);//3
		System.out.println(l2);//3
		
		int s1=1;
		int s2=2;
		
		System.out.println(--s2 - ++s1 + ++s2 - --s1);
		
		System.out.println(s1);//1
		System.out.println(s2);//2
		
		int i=19,j=29,k; 
		
		k= i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
		//19 -18+28-29+18-29+19-28=-20
		System.out.println(k);//-20
		System.out.println(19);//19
		System.out.println(29);//29
		
		int sos = 10;
		int dos = sos+1;
		System.out.println(dos);//11
		
		sos+=2;//sos=10+2=12
		sos=sos+2;//12+2=14
		System.out.println(sos);
		
		int m=0,n=0;
		
		int pp = --m * --n * n-- * m--;
		
		System.out.println(m);//-2
		System.out.println(n);//-2
		
		System.out.println(pp);//1
		
		int xx =111;
		int cx =120;
		
		short res = (short) (xx+cx);//111+120-->231
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
