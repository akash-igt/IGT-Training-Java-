class Bank
{
//	Bank()
//	{
//		
//	}
	public void roi()
	{
		System.out.println("10%");
	}
}
class SBI extends Bank
{
	//Bank()
//	{
//		
//	} you cannot override constructor because it should be same name as class name: hence 
}
class Axis extends Bank
{
	public void roi()
	{
		System.out.println("13%");
	}
}
public class Demo7 {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.roi();
		
		Axis a=new Axis();
		a.roi();
		
	}

}
