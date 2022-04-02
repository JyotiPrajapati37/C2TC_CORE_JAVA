package Demo;

public class WithException {

	public static void main(String[] args) {
		System.out.println("Hii");
		try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println(10/2);
			System.out.println(e);
	}
		System.out.println("Hello");
}
}