class A
{
	A()
	{
		System.out.println("A()");
	}
	A(int a)
	{
		System.out.println("A(int a) = "+a);
	}
	A(int a, int b)
	{
		System.out.println("A(int a, int b)"+a+", "+b);
	}
	A(String a)
	{
		System.out.println("A(String a)"+a);
	}
	void draw(int l, int b)
	{
		System.out.println("Area : "+l*b);
	}
}
public class Demo6 {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(1);
		A a3=new A(2,3);
		A a4=new A("Akash");
		a1.draw(19, 29);
		
	}

}
