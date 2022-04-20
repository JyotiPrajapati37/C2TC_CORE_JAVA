package Demo.ArrayList;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		String [] a =new String[1000];
		a[0] = "Avantika";
		a[1] ="Arayan";
//		a[3]=10;   //Compile time error
//		ArrayList l =new ArrayList();
//		String name1 = l.get(0);
		ArrayList<String> l = new ArrayList<>();
		l.add("Jyoti");
		String name = (String) l.get(0);
		System.out.println(name);
				
		
	}

}
