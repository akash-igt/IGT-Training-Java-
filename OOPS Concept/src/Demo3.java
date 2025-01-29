class Parent
{
    Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("Child Constructor");
    }
}
class Demo3
{
    public static void main(String a[])
    {
        Child c = new Child();
        //when child object is created it automatically call the parent default constructor.
    }
}