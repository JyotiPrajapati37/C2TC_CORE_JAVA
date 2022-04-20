package Demo.Final;

public class Final_Access_Demo2 {

	public static void main(String[] args) 
	
	{
	   System.out.println("x");
	}

}

	class final_child extends Final_Access_Demo //Final Class cannot be inherited
	{
	
}

	class j{
		
final	int b=10;
		
		void Final() 
		{
//			b=20; //Final Variable cannot be reassigned
		}
		
	}
	
class parent 

{
	void property()
	
	{
		System.out.println("You will get..... House,Car,Gold,Plot");
	}
	
final void marry()
	
	{
		System.out.println("You shoiuld Marry Lata for this");
	}

}

class child extends parent 

{
	// void marry() //Method Overriding .... Changing the defination of ,method without changing the name   //Final method so cannot be overridden
	{
		System.out.println(" I will not Marry Lata for this");
	}
}
