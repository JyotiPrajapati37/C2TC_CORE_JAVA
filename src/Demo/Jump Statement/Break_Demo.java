package Demo;

public class Break_Demo {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			if(i==5) 
				break;
			
			System.out.println("Good Afternoon"); //will print till counter reaches 5 and after that it will come out of the  loop
		}
		
		int x=10;
		
	l: // Labeled block
	{
		System.out.println("Login"); // It will enter labeled block and print it
		
		if(x==10)
			break l; //condition becomes true so control goes out of the loop
		
		System.out.println("End");
	}
	
	System.out.println("Hello");//after coming out of loop print this

	}
}
