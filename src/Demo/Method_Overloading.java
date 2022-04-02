package Demo;

public class Method_Overloading {
	public void demo()
	{
		System.out.println("No args method");	
	}
	
	public void demo(double d)
	{
		System.out.println(" Double args method");	
	}	
	
	public void demo1(int i)
	{
		System.out.println(" Integer args method");	
	}	
	
	public void demo1(double d)
	{
		System.out.println(" Double args method");	
	}	

	public static void main(String[] args) {
		Method_Overloading obj=new Method_Overloading();
		
		obj.demo(127); // Double args method will be printed 
				
				obj.demo1('c'); // Integr args method will be printed

	}

}
