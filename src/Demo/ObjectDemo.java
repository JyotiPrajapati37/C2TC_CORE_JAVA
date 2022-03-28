package Demo;

class A
{
	int i;
	char c='C';
	float f;
	 A() //no-argument constructor
	 {
		f=8.88f;		
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		A Obj= new A();
		System.out.println(Obj.i);
		}
}
