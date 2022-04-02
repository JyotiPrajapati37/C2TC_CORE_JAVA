package Demo;

public class Array_3D_Demo1 {

	public static void main(String[] args) {
int [][][] x= {{{10,20,30},{40,50,60}},{{70,80,90},{100,110}}};
		
     	System.out.println(x.length); // To Print Array Length
		
		System.out.println(x[0][0][0]);
		
		System.out.println(x[0][0][1]);
		
		System.out.println(x[0][0][2]);
		
		System.out.println(x[0][1][0]);
		
       System.out.println(x[0][1][1]);

       System.out.println(x[0][1][2]);
       
       System.out.println(x[1][0][0]);
       
       System.out.println(x[1][0][1]);
       
       System.out.println(x[1][0][2]);
       
       System.out.println(x[1][1][0]);
       
       System.out.println(x[1][1][1]);
       
       
       int [][][] arr =new int[2][][];  //Another way of array declaration when multiple size of array level
       
       arr[0]=new int[3][];
       
       arr[0][0]=new int [1]; 

	}

}
