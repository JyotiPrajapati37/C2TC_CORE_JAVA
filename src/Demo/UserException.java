package Demo;


class InvalidAgeException extends Throwable
{
	InvalidAgeException(String msg)
	{
		System.out.println(msg);
	}
}
public class UserException {

	public static void main(String[] args) 
	
	{
		try
		{
			vote(20);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
	}
	public static void vote(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not Eligile for voting");
		}
		else {
			System.out.println("Eligile for voting");
		}
	}
}
