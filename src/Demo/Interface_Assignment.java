package Demo;
interface bank

{
	
	float rateOfInterest(); // Abstract Method
	
}

class SBI implements bank // Child class to implement abstract method

{ 
	
	public float rateOfInterest() //Method Overriding....using same method by changing its implementation
	
	
	{
		
		return 9.15f;
		
	}
	
}

class ICICI implements bank // Child class to implement abstract method

{
	
	public float rateOfInterest() //Method Overriding....using same method by changing its implementation
	
	{
		
		return 9.7f;
		
	}
	
}
public class Interface_Assignment {

	public static void main(String[] args) {
		bank b=new SBI(); //Another way of creating Interface objects

		b.rateOfInterest();

		System.out.println("ROI :" +b.rateOfInterest());

		       ICICI i=new ICICI();

		       i.rateOfInterest();

		       System.out.println("ROI :" +i.rateOfInterest());

	}

}
