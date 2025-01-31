package Project;
import java.util.*;
class A
{
	A(){
		
	}
	A(String name)
	{
		System.out.println("A(String Name)");
	}
	void abc()
	{
		System.out.println("1st abc");
	}
}
class B extends A
{
	B()
	{
		this(100);
		System.out.println("Hi B()");
	}
	B(int a)
	{
		super("Akash");
		System.out.println("Hi B(int a)");
	}
	void abc()
	{
		super.abc();
		System.out.println("2nd ABC");
	}
}
public class Project4 {
	public static void main(String[] args) {
		B b = new B();
		b.abc();
		B b1 = new B(199);
	}
}
