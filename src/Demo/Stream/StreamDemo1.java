package Demo.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Demo.Outer_static.inner;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> orignal = List.of(13,45,63,24,8,96,54,22,33,21,26,84);
		System.out.println(orignal);
		List<Integer> evenList = new ArrayList<>();
		
		for(Integer i : orignal)
		{
			if(i%2==0)
			{
				evenList.add(i);
			}
		}
		System.out.println(evenList);
		
		Stream<Integer> stream = orignal.stream();
//	List<Integer> l2  = stream.filter(i -> i % 2 ==0).collect(Collectors.toList());
	List<Integer> l2 = stream.filter(i -> i > 20).collect(Collectors.toList());
		System.out.println(l2);
//		filter : condition
	}

}
