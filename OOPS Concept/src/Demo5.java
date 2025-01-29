class Employee
{
	
}
class Clerk1 extends Employee
{
	Address a = new Address();
}
class Developer1 extends Employee
{
	Address a = new Address();
	void display()
	{
		System.out.println("Pin = "+a.pin);
	}
}
class Address
{
	int pin = 4220101;
	
}
public class Demo5 {

	public static void main(String[] args) {
		Developer1 d = new Developer1();
		d.display();

	}

}
