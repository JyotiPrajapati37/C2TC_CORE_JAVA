package Demo;

public class Static_Student {
	int roll;
	String name;
	static String college = "Mumbai University";
	
	public Static_Student(int r, String n) {
		roll = r;
		name = n;
	}

	void display() {
		System.out.println(roll + " " + name + " " + college);
	}
	
	public static void main(String[] args) {
		Static_Student s1=new Static_Student(1, "jyoti");
		Static_Student s2=new Static_Student(2, "Anusha");
		s1.display();
		s2.display();
		
	}

}
