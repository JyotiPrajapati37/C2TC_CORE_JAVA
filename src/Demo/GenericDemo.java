package Demo;


public class GenericDemo {

	public static void main(String[] args) {
		Container<Integer> obj = new Container<>();
		obj.value = 2;
		obj.show();
	}
}

class Container<T> {
	T value;

	public void show() {
		System.out.println(value.getClass().getName());
	}
}