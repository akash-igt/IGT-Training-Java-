import java.io.*;
import java.util.*;

class X
{
	void display()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter valid Age ?");
		int age=sc.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException("Invalid age bcz is less than 18 : min age");
		}
		else if(age>60)
		{
			throw new InvalidAgeException("Invalid age bcz is greater than 60 : max age");
		}
		else
		{
			System.out.println("Valid");
		}
	}
		
}
public class Demo4 {

	public static void main(String[] args) {
		
		try
		{
			X x = new X();
			x.display();
			
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}