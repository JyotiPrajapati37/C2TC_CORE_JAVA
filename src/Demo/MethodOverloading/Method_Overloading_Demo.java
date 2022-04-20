package Demo.MethodOverloading;

public class Method_Overloading_Demo {
	 public void m() // compiler checks for exact match to method call
		{
		System.out.println("No args method");	
		}
		
		public void m(int i)  // integer method signature
		{
			System.out.println("Integer args method");
		}
		
		public void m(double d) // double method signature
		{
			System.out.println("Double args method");
		}
		
		/* public void m(byte b) // double method signature
		{
			System.out.println("Byte args method");
		} */
		

	public static void main(String[] args) {
Method_Overloading_Demo m= new Method_Overloading_Demo(); 
		
		m.m();      // No args- Method // No args method will be called and printed
		m.m(2.45);  // Double Method   // Double args method will be called and printed
		m.m(2);     // Integer Method  // Integer args method will be called and printed
		
		m.m('c'); //Converted to integer using autoomatic promotion chart // Integer args method will be called and printed
		m.m(127); //Converted to integer using autoomatic promotion chart // Integer args method will be called and printed

	}

}
