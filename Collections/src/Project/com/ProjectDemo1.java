package Project.com;

import java.util.*;

class Emp
{
	int id, age, salary;
	String name, desig;
	Scanner sc=new Scanner(System.in);
	Emp()
	{
		System.out.print("Enter Id : ");
		id = sc.nextInt();
		System.out.print("Enter Name : ");
		name = sc.next();
		System.out.println("Enter Age : ");
		age = sc.nextInt();
	}
	void display()
	{
		System.out.println("==========================");
		System.out.println("Id : "+id);
		System.out.println("Name  : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+desig);
	}
}
class Clerk extends Emp
{
	Clerk()
	{
		salary = 20000;
		desig = "Clerk";
	}
}
class Developer extends Emp
{
	public Developer() {
		salary = 50000;
		desig = "Jr.Developer";
	}
}

public class ProjectDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Emp> e1 = new ArrayList<Emp>();
		int ch = 0, ch1=0;
		do {
			System.out.println("=====================================");
			System.out.println("1) Create | 2) Display | 3) Exit..!");
			System.out.print("Enter Choice : ");
			ch = sc.nextInt();
			if(ch == 1)
			{
				do {
					System.out.println("=====================================");
					System.out.println("1) Clerk | 2) Developer | 3) Exit..!");
					System.out.print("Enter Choice : ");
					ch1 = sc.nextInt();
					if(ch1 == 1)
					{
						e1.add(new Clerk());
					}
					if(ch1 == 2)
					{
						e1.add(new Developer());
					}
//					if(ch1 == 3)
//					{
////						System.out.println("Thank You..!");
//						System.exit(0);
//					}
					
					
				} while (ch1 != 3);
			}
			else if(ch == 2)
			{
				Iterator i = e1.iterator();
				while(i.hasNext())
				{
					Emp e = (Emp)i.next();
					e.display();
//						or
//					System.out.println(i.next());
					
				}
			}
			else if(ch == 3)
			{
				System.out.println("Thank You..!");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid Choice");
			}
			
		} while (ch != 3);
		
	}

}
