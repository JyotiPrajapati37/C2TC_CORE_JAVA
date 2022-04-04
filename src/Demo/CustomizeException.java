package Demo;

import java.util.*;
import  java.io.IOException;

public class CustomizeException {

	public static void main(String[] args)  throws CantVote {
		
		int age;
		System.out.println("Enter Your Age");
		 Scanner s = new Scanner(System.in);
		age=s.nextInt();
		//no try catch lock
		if (age<18)
		{
			throw new CantVote("You cannot cast your vote.....");
		}
		else
		{
			System.out.println("You can happily vote....");
		}
	}

}
//class CantVote extends RuntimeException {
//public CantVote(String msg) {
//	super(msg);
//}
//}
class CantVote extends Throwable {
 public  CantVote (String msg) 
 {
	super(msg);
}
}