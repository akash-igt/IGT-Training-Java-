import java.util.*;

public class Demo1 {

	public static void main(String[] args) 
	{
		m1();
	}
	static void m1() 
	{
		m2();
		System.out.println("Hi M1 Method...!");
	}
	static void m2()
	{
		m3();
		System.out.println("Hi M2 Method...!");
	}
	static void m3()
	{
		try
		{
			System.out.println("Hi M3 Method...!");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter 1st Value : ");
			int a=sc.nextInt();
			System.out.print("Enter 2nd Value : ");
			int b=sc.nextInt();
			int res = a/b;
			System.out.println("Result : "+res);
			
		}
		catch(InputMismatchException im)
		{
			System.out.println("Put only Numbers...!" +im);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Not allowed no. divisible by 0...!" +ae);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
