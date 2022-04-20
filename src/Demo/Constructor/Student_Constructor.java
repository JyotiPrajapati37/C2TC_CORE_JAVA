package Demo.Constructor;

public class Student_Constructor {
	String name;
	int rollno, age;
	

	public Student_Constructor(String name,int rollno, int age) 
	{
		this.name=name;  //this is a reference variable that refers to the current object.
		this.rollno=rollno;
		this.age=age;
	
	}


	public static void main(String[] args) {
		Student_Constructor s1=new Student_Constructor("Jyoti", 1, 30);
		Student_Constructor s2=new Student_Constructor("Komal", 2, 15);
//		System.out.println(s1.age);
		System.out.println(s1.name+ " "+ s1.rollno+ " "+s1.age);
		System.out.println(s2.name+ " "+ s2.rollno+ " "+s2.age);
	
	}

}
