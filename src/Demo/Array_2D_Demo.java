package Demo;

public class Array_2D_Demo {

	public static void main(String[] args) {
		int [] arr=new int[3];
		
		System.out.println(arr.getClass().getName());  //Print class for int type array. 
int [][] x= {{10,20,30},{40,50},{60,70,80}};
		
		System.out.println(x.length);
		
		System.out.println(x[0][0]);
		
		System.out.println(x[0][1]);
		
		System.out.println(x[0][2]);
		
		System.out.println(x[1][0]);

		System.out.println(x[1][1]);
		
		System.out.println(x[1][2]); // Array Index Out OF Bound Exception due to size of array
	
		  
	       int [][] arri =new int[4][];  //Another way of array declaration when multiple size of array level
	       
	       arri[0]=new int[3];
	       
	       arri[1]=new int [2]; 
	       
	   	int [][] x1=new int[2][3];
	       
	    System.out.println(x1); //pointing to array so its address will be printed
		
		System.out.println(x1[0]); // Pointing to one dimensional array contains its address
		
		System.out.println(x1[0][0]); ///Default values will be printed since no assigned.
		
		System.out.println(x1[0][1]);
		
		System.out.println(x1[1][0]);
		
		System.out.println(x1[1][1]);
	}

}
