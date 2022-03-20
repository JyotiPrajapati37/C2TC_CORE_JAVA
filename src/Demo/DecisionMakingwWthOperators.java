package Demo;

public class DecisionMakingwWthOperators {

	public static void main(String[] args) {
		int x = 5; //x=4;
		if(x !=5)
		{
			System.out.println("Value of x is not 5");
		}
		else 
		{
			System.out.println("Value of x is 5");
		}
		
		// taking two value for comparison
		int a = 8, b = 7;
		if(a >= b)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		//DecisionMakingw With OR operators
		int p = 10; int q = 11;
		if(!(p < q)||(p == q)) 
		{
			System.out.println("Condition is TRUE");
		}
		else
		{
			System.out.println("Condition is FALSE");
		}
		
		// get married age of boy and girl
		
		int ageOfBoy = 26;
		int ageOfGirl = 23;
		
		if((ageOfBoy >=21) && (ageOfGirl>=18))
		{
			System.out.println("Ready to get married");
		}
		else
		{
			System.out.println("Wait for it kiddo!");
		}
		
	}

}
