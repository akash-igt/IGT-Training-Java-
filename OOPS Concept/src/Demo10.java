class A1
{
	static int x = 2000;
	static void display()
	{
		System.out.println("Hello...!");
	}
	public static void main(String args)
	{
		System.out.println("Mr. "+args);
	}
}	


public class Demo10 {

	public static void main(String[] args) {
		A1.display();
		A1.main("Akash");
		System.out.println(A1.x);

	}

}
