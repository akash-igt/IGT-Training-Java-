class Animal
{
	public void makeSound()
	{
		System.out.println("Animal Make sound..!");
	}
}
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Woff Woff..!");
	}
}
class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Meow Meow..!");
	}
}
public class Demo8 {

	public static void main(String[] args) {
		
		Animal a=new Dog();
		a.makeSound();
		Animal b=new Cat();
		b.makeSound();
	}

}
