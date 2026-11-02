class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;

        System.out.println("Person Constructor");
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {

    int empId;
    double salary;

    Employee(String name, int age, int empId, double salary) {

        super(name, age);

        this.empId = empId;
        this.salary = salary;

        System.out.println("Employee Constructor");
    }

    void display() {

        super.display();

        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {

    double bonus;

    Manager(String name, int age, int empId,
            double salary, double bonus) {

        super(name, age, empId, salary);

        this.bonus = bonus;

        System.out.println("Manager Constructor");
    }

    void display() {

        super.display();

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class ManagerTest {

    public static void main(String[] args) {

        Manager m1 = new Manager("Rahul", 25, 101, 40000, 10000);

        System.out.println();

        m1.display();
    }
}