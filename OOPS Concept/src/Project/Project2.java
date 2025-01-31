package Project;

import java.util.Scanner;

interface I {
    void vehicle();
}

abstract class Emp1 implements I {
    int id;
    int age;
    String name;
    String designation = "Trainee";
    int salary = 20000;

    Emp1() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = s1.nextLine();

        System.out.print("Enter ID: ");
        id = s1.nextInt();

        System.out.print("Enter Age: ");
        age = s1.nextInt();
    }

    abstract void raisesalary();

    void display() {
        System.out.println("*************************");
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My Salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation: " + designation);
    }
}

class Developer1 extends Emp1 {
    Developer1() {
        super();
    }

    void raisesalary() {
        salary += 40000;
        System.out.println("Salary raised! New salary: " + salary);
    }

    @Override
    public void vehicle() {
        System.out.println("Rikshaw for Developer");
    }
}

class Tester1 extends Emp1 {
    Tester1() {
        super();
    }

    void raisesalary() {
        salary += 20000;
        System.out.println("Salary raised! New salary: " + salary);
    }

    @Override
    public void vehicle() {
        System.out.println("Bus for Tester");
    }
}

class Clerk1 extends Emp1 {
    Clerk1() {
        super();
    }

    void raisesalary() {
        salary += 10000;
        System.out.println("Salary raised! New salary: " + salary);
    }

    @Override
    public void vehicle() {
        System.out.println("Cab for Clerk");
    }
}

public class Project2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Developer1 d = null;
        Tester1 t = null;
        Clerk1 c = null;

        int ch1, ch2;

        do {
            System.out.println("================================");
            System.out.println("1) Display");
            System.out.println("2) Create Employee");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            ch1 = sc.nextInt();

            switch (ch1) {
                case 1:
                    if (d != null) {
                        d.display();
                        d.vehicle();
                    }
                    if (t != null) {
                        t.display();
                        t.vehicle();
                    }
                    if (c != null) {
                        c.display();
                        c.vehicle();
                    }
                    if (d == null && t == null && c == null) {
                        System.out.println("No employee records to display.");
                    }
                    break;

                case 2:
                    do {
                        System.out.println("================================");
                        System.out.println("1) Developer");
                        System.out.println("2) Tester");
                        System.out.println("3) Clerk");
                        System.out.println("4) Back <-");
                        System.out.print("Enter your choice: ");
                        ch2 = sc.nextInt();

                        switch (ch2) {
                            case 1:
                                d = new Developer1();
                                break;
                            case 2:
                                t = new Tester1();
                                break;
                            case 3:
                                c = new Clerk1();
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Invalid choice, try again.");
                        }
                    } while (ch2 != 4);
                    break;

                case 3:
                    boolean raised = false;
                    if (d != null) {
                        System.out.println("Raising salary for Developer...");
                        d.raisesalary();
                        raised = true;
                    }
                    if (t != null) {
                        System.out.println("Raising salary for Tester...");
                        t.raisesalary();
                        raised = true;
                    }
                    if (c != null) {
                        System.out.println("Raising salary for Clerk...");
                        c.raisesalary();
                        raised = true;
                    }
                    if (!raised) {
                        System.out.println("No Employee has been created yet.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close(); // Close Scanner
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (ch1 != 4);
    }
}
