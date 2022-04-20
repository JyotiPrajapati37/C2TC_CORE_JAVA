package Demo;

public class Continue_Demo {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
				continue;
			
			System.out.println(i);
			
			// first i will be 0 then it will enter the loop and 0%2=0
			//so it will skip the iteration and move to next iteration.
			//It will increment counter i becomes 1 and condition will become false and this will go till the loping condition becomes false
		
		}
		int x=0;
		
		do
		{
			
			x++;
			System.out.println(x);
			
			if(++x<5)
				continue;
			
			x++;
			System.out.println(x);
			
		}while(++x<10);
		
		/* 1.x=0 ...>x=1
		   2. print 1
		   3.1+1= 2<5 
		   4.continue statements ..> skips current iteration and control  goes to while..> ++x..> x=3 3<10 then do statement gets into loop x++..>x=3+1...>x=4
		   5.print 4
		   6.same goes on till ++x<10 */

	}

}
