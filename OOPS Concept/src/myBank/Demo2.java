package myBank;

class A1
{
	
}
class B1 extends A1 {}
//class C extends A, B{} multiple inheritance does not supported
interface I
{
	int abc=10;
}
interface J extends I
{
	
}
interface K extends I, J //Multiple inheritance can ve achieve via interface
{
	
}
class L implements I
{
	
}
public class Demo2 {

	public static void main(String[] args) {
		L a= new L();
		System.out.println(a.abc);
	}

}
