
final class Car
{
	final int speed = 2000;
	String model = "2025";
	int price = 100000;
	final void gear()
	{
		System.out.println("5-Gear");
	}
}
//class BMW extends Car // if class declared final cannot inherit
//{
//	void gear() //if Method declared final cannot override
//	{
//		System.out.println("No Gears");
//	}
//}


public class Demo9 {
	public static void main(String[] args) {
		Car c=new Car();
		//c.speed=3000; if variable declared final cannot modified
		System.out.println(c.speed);
		System.out.println(c.model);
		System.out.println(c.price);
		
	}
}
