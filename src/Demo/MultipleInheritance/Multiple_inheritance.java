package Demo.MultipleInheritance;

//Java program to demonstrate How Diamond Problem
//Is Handled in case of Default Methods

//Interface 1
interface GPI {

 // Default method
 default void show()
 {

     // Print statement
     System.out.println("Default GPI");
 }
}

//Interface 2
//Extending the above interface
interface PI1 extends GPI {
}

//Interface 3
//Extending the above interface
interface PI2 extends GPI {
}
//Main class
//Implementation class code
class Multiple_inheritance implements PI1, PI2 {
//public class Multiple_inheritance {

	public static void main(String[] args) {

        // Creating object of this class
        // in main() method
		Multiple_inheritance d = new Multiple_inheritance();
 
        // Now calling the function defined in interface 1
        // from whom Interface 2and 3 are deriving
        d.show();

	}

}
