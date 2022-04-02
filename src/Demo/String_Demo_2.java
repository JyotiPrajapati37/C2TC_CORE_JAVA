package Demo;

public class String_Demo_2 {

	public static void main(String[] args) {
		String s=new String ("Jyoti");

		/*  s.concat("Prajapati"); // objects are Immutable does not change value.
		System.out.println(s);
		System.out.println(s.length()); // Gives string length
		System.out.println(s.toUpperCase()); // Converts string to Upper string
		System.out.println(s.toLowerCase()); // Converts string to Lower string
		System.out.println(s.substring(2)); // Prints a part of the substring starting from index 1.
		System.out.println(s.substring(1, 5)); // Prints a part of the substring starting from index 1 and prints ill 4 since we want to exclude the last index mentioned.
		System.out.println(s.isEmpty()); // Returns whether the string is empty or not.
		System.out.println(s.replace("Jyoti", "Khushi")); //Replace Jyoti with Khushi
		System.out.println(s.equalsIgnoreCase("Jyoti")); */

		// To DEcide the Operating behavior of '+' operator 

		String a="Java";
		int b=10,c=20,d=30;

		System.out.println(a+b+c+d); // Because a is string so acts as concatenation = java102030

		System.out.println(b+c+d+a); // Because b is int so acts as arithmatic operator = 60Java

		System.out.println(b+c+a+d); //Because b is int so acts as arithmatic operator = 30Java30

		System.out.println(b+a+c+d); //Because b is int so acts as arithmatic operator = 10Java2030

	}

}
