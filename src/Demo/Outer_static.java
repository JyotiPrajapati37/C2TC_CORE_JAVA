package Demo;

public class Outer_static {
	int x = 10;
	static int y = 100;

	static class inner {
		public void method_demo() {
			System.out.println("I am Inner class");
			System.out.println(y);
//			System.out.println(x);
		}
	}

	public static void main(String[] args) {
//		Outer_static obj = new Outer_static();
//		obj.method_demo();// Can't call inner method without creating object
	
		Outer_static.inner obj2 = new Outer_static.inner();
		obj2.method_demo();

		inner obj3 = new inner();
		obj3.method_demo();
	}

}
