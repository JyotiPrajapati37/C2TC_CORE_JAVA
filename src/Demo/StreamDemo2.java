package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.security.auth.login.FailedLoginException;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(29);
		marks.add(12);
		marks.add(44);
		marks.add(67);
		marks.add(12);
		marks.add(78);

		System.out.println(marks);
		
		List<Integer> updateMarks =marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(updateMarks);
		
		long Failed =marks.stream().filter(i -> i <33).count();
		System.out.println(Failed);
		
//		map : apply to all
//		count : for counting elements
	}

}
