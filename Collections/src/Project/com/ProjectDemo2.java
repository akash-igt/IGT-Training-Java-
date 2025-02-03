package Project.com;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 
// Employee Base Class
class Employee {
    int id, age, salary;
    String name, desig;
    Scanner sc = new Scanner(System.in);
 
    // Constructor
    Employee() {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }
 
    // Display Employee Details
    void display() {
        System.out.println("*************************");
        System.out.println("Name        : " + name);
        System.out.println("ID          : " + id);
        System.out.println("Age         : " + age);
        System.out.println("Salary      : " + salary);
        System.out.println("Designation : " + desig);
        System.out.println("*************************");
    }
}
 
// Clerk Class
class Clerk1 extends Employee {
    public Clerk1() {
        salary = 30000;
        desig = "Clerk";
    }
}
 
// Developer Class
class Dev extends Employee {
    public Dev() {
        salary = 50000;
        desig = "Developer";
    }
}
class Tester extends Employee
{
	public Tester() {
		salary = 30000;
		desig = "Tester";
	}
}
class Manager extends Employee
{
	public Manager() {
		salary = 80000;
		desig = "Manager";
	}
}
 
// Main Class
public class ProjectDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();
        int ch1, ch2;
 
        do {
            System.out.println("\n================================");
            System.out.println("1) Create Employee");
            System.out.println("2) Display Employees");
            System.out.println("3) Update Employee");
            System.out.println("4) Delete Employee");
            System.out.println("5) Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");
            ch1 = sc.nextInt();
 
            switch (ch1) {
                case 1: // CREATE EMPLOYEE
                    do {
                        System.out.println("\n================================");
                        System.out.println("1) Clerk");
                        System.out.println("2) Developer");
                        System.out.println("3) Tester");
                        System.out.println("4) Manager");
                        System.out.println("5) Exit");
                        System.out.println("================================");
                        System.out.print("Enter your choice: ");
                        ch2 = sc.nextInt();
 
                        if (ch2 == 1) empList.add(new Clerk1());
                        if (ch2 == 2) empList.add(new Dev());
                        if (ch2 == 3) empList.add(new Tester());
                        if (ch2 == 4) empList.add(new Manager());
 
                    } while (ch2 != 5);
                    break;
 
                case 2: // READ (DISPLAY) EMPLOYEES
                    if (empList.isEmpty()) {
                        System.out.println("No employees found.");
                    } else {
                        for (Employee e : empList) {
                            e.display();
                        }
                    }
                    break;
 
                case 3: // UPDATE EMPLOYEE
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = sc.nextInt();
                    boolean found = false;
                    
                    for (Employee e : empList) {
                        if (e.id == updateId) {
                            System.out.println("Enter New Name: ");
                            e.name = sc.next();
                            System.out.println("Enter New Age: ");
                            e.age = sc.nextInt();
                            System.out.println("Employee updated successfully!");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee ID not found.");
                    break;
 
                case 4: // DELETE EMPLOYEE
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    Iterator<Employee> itr = empList.iterator();
                    boolean deleted = false;
                    
                    while (itr.hasNext()) {
                        if (itr.next().id == deleteId) {
                        	itr.remove();
                            System.out.println("Employee deleted successfully.");
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) System.out.println("Employee ID not found.");
                    break;
 
                case 5: // EXIT
                    System.out.println("Thank you!");
                    System.exit(0);
                    break;
 
                default:
                    System.out.println("Invalid choice, please try again.");
            }
 
        } while (ch1 != 5);
    }
}